package com.mobile.goal.ui.profile.settings.edit_account

import android.content.ContentUris
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.util.Patterns
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.remote.dto.EditAccountDto
import com.mobile.goal.domain.use_case.EditAccountUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

data class EditAccountState(
    val isLoading: Boolean = false,
    val firstNameError: String = "",
    val lastNameError: String = "",
    val emailError: String = "",
    val locationError: String = "",
    val phoneNumberError: String = "",
    val profileImageError: String = "",
    val profilePublicError: Boolean = false,
)


sealed class EditAccountUiEvent {
    data class ShowSnackBar(val message: String) : EditAccountUiEvent()
    object NavigateToHome : EditAccountUiEvent()
    object NavigateToPrevious : EditAccountUiEvent()
}

@HiltViewModel
class EditAccountViewModel @Inject constructor(
    private val editAccountUseCase: EditAccountUseCase,
    private val sessionDataStore: SessionDataStore
) : ViewModel() {

    private val _firstNameState = mutableStateOf("")
    var firstNameState: State<String> = _firstNameState

    private val _lastNameState = mutableStateOf("")
    var lastNameState: State<String> = _lastNameState

    private val _emailState = mutableStateOf("")
    var emailState: State<String> = _emailState

    private val _locationState = mutableStateOf("")
    var locationState: State<String> = _locationState

    private val _phoneNumberState = mutableStateOf("")
    var phoneNumberState: State<String> = _phoneNumberState

    private val _profileImageState = mutableStateOf("")
    var profileImageState: State<String> = _profileImageState

    private var newImageSelected = false

    private val _profilePublic = mutableStateOf(false)
    var profilePublicState: State<Boolean> = _profilePublic

    private val _state = mutableStateOf(EditAccountState())
    val state: State<EditAccountState> = _state

    private val _eventFlow = MutableSharedFlow<EditAccountUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: EditAccountEvent) {
        when (event) {
            is EditAccountEvent.EnteredFName -> _firstNameState.value = event.value
            is EditAccountEvent.EnteredLName -> _lastNameState.value = event.value
            is EditAccountEvent.EnteredEmail -> _emailState.value = event.value
            is EditAccountEvent.EnteredLocation -> _locationState.value = event.value
            is EditAccountEvent.EnteredPhoneNumber -> _phoneNumberState.value = event.value
            is EditAccountEvent.SelectProfileImage -> {
                _profileImageState.value = event.value
                newImageSelected = event.newImageSelected
            }
            is EditAccountEvent.CheckProfilePublic -> _profilePublic.value = event.value
        }
    }


    private fun isExternalStorageDocument(uri: Uri?): Boolean {
        return "com.android.externalstorage.documents" == uri?.authority
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    private fun isDownloadsDocument(uri: Uri?): Boolean {
        return "com.android.providers.downloads.documents" == uri?.authority
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    private fun isMediaDocument(uri: Uri?): Boolean {
        return "com.android.providers.media.documents" == uri?.authority
    }

    private fun getDataColumn(
        context: Context, uri: Uri?,
        selection: String?, selectionArgs: Array<String>?,
    ): String? {
        var cursor: Cursor? = null
        val projection = arrayOf(MediaStore.Images.Media.DATA)
        try {
            cursor =
                context.contentResolver.query(uri!!, projection, selection, selectionArgs, null)
            if (cursor != null && cursor.moveToFirst()) {
                val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
                return cursor.getString(columnIndex)
            }
        } finally {
            cursor?.close()
        }
        return null
    }


    fun getPath(context: Context, uri: Uri?): String? {
        try {
            val isKitKat = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
            if (isKitKat && DocumentsContract.isDocumentUri(context, uri)) {
                if (isExternalStorageDocument(uri)) {
                    val docId = DocumentsContract.getDocumentId(uri)
                    val split =
                        docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    val type = split[0]
                    if ("primary".equals(type, ignoreCase = true)) {
                        return Environment.getExternalStorageDirectory().toString() + "/" + split[1]
                    }
                } else if (isDownloadsDocument(uri)) {
                    val id = DocumentsContract.getDocumentId(uri)
                    val contentUri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"),
                        java.lang.Long.valueOf(id)
                    )
                    return getDataColumn(context, contentUri, null, null)

                } else if (isMediaDocument(uri)) {
                    val docId = DocumentsContract.getDocumentId(uri)
                    val split =
                        docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    val type = split[0]
                    var contentUri: Uri? = null
                    when (type) {
                        "image" -> contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                        "video" -> contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                        "audio" -> contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                    }
                    val selection = "_id=?"
                    val selectionArgs = arrayOf(split[1])
                    return getDataColumn(context, contentUri, selection, selectionArgs)
                }

            } else if ("content".equals(uri?.scheme, ignoreCase = true)) {
                return getDataColumn(context, uri, null, null)
            } else if ("file".equals(uri?.scheme, ignoreCase = true)) {
                return uri?.path
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }

    suspend fun populateParticipantInfo() {
        sessionDataStore.getUpdatedProfile()?.apply {

            first_name?.let {
                onEvent(EditAccountEvent.EnteredFName(it))
            }
            last_name?.let {
                onEvent(EditAccountEvent.EnteredLName(it))
            }
            email?.let {
                onEvent(EditAccountEvent.EnteredEmail(it))
            }
            place?.let {
                onEvent(EditAccountEvent.EnteredLocation(it))
            }
            phone?.let {
                onEvent(EditAccountEvent.EnteredPhoneNumber(it))
            }
            profile_image?.let {
                onEvent(EditAccountEvent.SelectProfileImage(it))
            }
        }
    }

    suspend fun editAccount() {

        val firstName = firstNameState.value
        val lastName = lastNameState.value
        val email = emailState.value
        val location = locationState.value
        val phoneNumber = phoneNumberState.value

        val profileImage = if (newImageSelected) profileImageState.value else null

        val profilePublic = profilePublicState.value

        if (firstName.isEmpty()) {
            _state.value = EditAccountState(firstNameError = "Name is required")
            return
        }
        if (lastName.isEmpty()) {
            _state.value = EditAccountState(lastNameError = "Name is required")
            return
        }
        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _state.value = EditAccountState(emailError = "Email format is invalid")
            return
        }
        if (location.isEmpty()) {
            _state.value = EditAccountState(locationError = "Location is required")
            return
        }
        if (phoneNumber.isEmpty()) {
            _state.value = EditAccountState(phoneNumberError = "Phone com.mobile.distantrace.domain.model.competition.Entrants.Number is required")
            return
        }
        /*   if (profileImage.isEmpty()) {
               _state.value = EditAccountState(profileImageError = "Profile Image is required")
               return
           }*/

        val participant = sessionDataStore.getUpdatedProfile()
        participant?.id?.let { id ->
            editAccountUseCase(
                id,
                EditAccountDto(
                    id = id,
                    firstName = firstName,
                    lastName = lastName,
                    email = email,
                    place = location,
                    phone = phoneNumber,
                    profile_image = profileImage
                )
            ).onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        _state.value = EditAccountState(isLoading = false)
                        if (result.data != null) {
                            result?.data?.email = _emailState.value
                            sessionDataStore.updateProfile(result.data)
                            sessionDataStore.updateIsProfileCompleted(true)
                            _eventFlow.emit(EditAccountUiEvent.NavigateToPrevious)
                        }
                    }
                    is Resource.Error -> {
                        _state.value = EditAccountState(isLoading = false)
                        _eventFlow.emit(
                            EditAccountUiEvent.ShowSnackBar(
                                message = result.message ?: "An unexpected error occurred"
                            )
                        )
                    }
                    is Resource.Loading -> {
                        _state.value = EditAccountState(isLoading = true)
                    }
                }
            }.launchIn(viewModelScope)
        }

    }

}