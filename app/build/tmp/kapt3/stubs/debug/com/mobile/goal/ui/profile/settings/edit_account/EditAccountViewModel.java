package com.mobile.goal.ui.profile.settings.edit_account;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u00105\u001a\u000206H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J;\u00108\u001a\u0004\u0018\u00010\t2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010\t2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010?H\u0002\u00a2\u0006\u0002\u0010@J\u001a\u0010A\u001a\u0004\u0018\u00010\t2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<J\u0012\u0010B\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0012\u0010C\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0012\u0010D\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u000e\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020GJ\u0011\u0010H\u001a\u000206H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR \u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0019\"\u0004\b(\u0010\u001bR\u000e\u0010)\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR \u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR \u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006I"}, d2 = {"Lcom/mobile/goal/ui/profile/settings/edit_account/EditAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "editAccountUseCase", "Lcom/mobile/goal/domain/use_case/EditAccountUseCase;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "(Lcom/mobile/goal/domain/use_case/EditAccountUseCase;Lcom/mobile/goal/data/local/data_store/SessionDataStore;)V", "_emailState", "Landroidx/compose/runtime/MutableState;", "", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/profile/settings/edit_account/EditAccountUiEvent;", "_firstNameState", "_lastNameState", "_locationState", "_phoneNumberState", "_profileImageState", "_profilePublic", "", "_state", "Lcom/mobile/goal/ui/profile/settings/edit_account/EditAccountState;", "emailState", "Landroidx/compose/runtime/State;", "getEmailState", "()Landroidx/compose/runtime/State;", "setEmailState", "(Landroidx/compose/runtime/State;)V", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "firstNameState", "getFirstNameState", "setFirstNameState", "lastNameState", "getLastNameState", "setLastNameState", "locationState", "getLocationState", "setLocationState", "newImageSelected", "phoneNumberState", "getPhoneNumberState", "setPhoneNumberState", "profileImageState", "getProfileImageState", "setProfileImageState", "profilePublicState", "getProfilePublicState", "setProfilePublicState", "state", "getState", "editAccount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataColumn", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getPath", "isDownloadsDocument", "isExternalStorageDocument", "isMediaDocument", "onEvent", "event", "Lcom/mobile/goal/ui/profile/settings/edit_account/EditAccountEvent;", "populateParticipantInfo", "app_debug"})
public final class EditAccountViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.EditAccountUseCase editAccountUseCase = null;
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _firstNameState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.State<java.lang.String> firstNameState;
    private final androidx.compose.runtime.MutableState<java.lang.String> _lastNameState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.State<java.lang.String> lastNameState;
    private final androidx.compose.runtime.MutableState<java.lang.String> _emailState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.State<java.lang.String> emailState;
    private final androidx.compose.runtime.MutableState<java.lang.String> _locationState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.State<java.lang.String> locationState;
    private final androidx.compose.runtime.MutableState<java.lang.String> _phoneNumberState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.State<java.lang.String> phoneNumberState;
    private final androidx.compose.runtime.MutableState<java.lang.String> _profileImageState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.State<java.lang.String> profileImageState;
    private boolean newImageSelected = false;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _profilePublic = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.State<java.lang.Boolean> profilePublicState;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.profile.settings.edit_account.EditAccountState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.profile.settings.edit_account.EditAccountState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.profile.settings.edit_account.EditAccountUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.profile.settings.edit_account.EditAccountUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public EditAccountViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.EditAccountUseCase editAccountUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getFirstNameState() {
        return null;
    }
    
    public final void setFirstNameState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.State<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getLastNameState() {
        return null;
    }
    
    public final void setLastNameState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.State<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getEmailState() {
        return null;
    }
    
    public final void setEmailState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.State<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getLocationState() {
        return null;
    }
    
    public final void setLocationState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.State<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getPhoneNumberState() {
        return null;
    }
    
    public final void setPhoneNumberState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.State<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getProfileImageState() {
        return null;
    }
    
    public final void setProfileImageState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.State<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.Boolean> getProfilePublicState() {
        return null;
    }
    
    public final void setProfilePublicState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.State<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.profile.settings.edit_account.EditAccountState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.profile.settings.edit_account.EditAccountUiEvent> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.profile.settings.edit_account.EditAccountEvent event) {
    }
    
    private final boolean isExternalStorageDocument(android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    private final boolean isDownloadsDocument(android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    private final boolean isMediaDocument(android.net.Uri uri) {
        return false;
    }
    
    private final java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object populateParticipantInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object editAccount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}