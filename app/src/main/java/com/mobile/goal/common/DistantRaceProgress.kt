package com.mobile.goal.common

import android.app.Activity
import androidx.core.content.ContextCompat
import com.kaopiz.kprogresshud.KProgressHUD
import com.mobile.goal.R
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

object DistantRaceProgress : CoroutineScope {
    //region Private methods
    private var mProgressDialogLib: KProgressHUD? = null
    private var autoDismissJob: Job? = null
    override val coroutineContext: CoroutineContext get() = Dispatchers.Main + Job()

    //endregion
//    region public methods
    fun showProgress(
        activity: Activity,
        title: String? = null,
        timeOut: Long? = null,
        isCancellable: Boolean = false
    ) {
        if (activity.isFinishing) return
        dismissProgress()
        KProgressHUD.create(activity).apply {
            setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            setBackgroundColor(ContextCompat.getColor(activity, R.color.colorProgressBg))
            setCancellable(isCancellable)
            setAnimationSpeed(2)
            setDimAmount(0.5f)
            if (!title.isNullOrEmpty())
                setLabel(title)
            show()
            mProgressDialogLib = this
        }
        starAutoDismissJob(timeOut)
    }

    private fun isShowing(): Boolean = mProgressDialogLib?.isShowing ?: false

    fun dismissProgress() {
        autoDismissJob?.cancel()
        if(isShowing())
            mProgressDialogLib?.dismiss()
    }

//    endregion
//    region private methods

    private fun starAutoDismissJob(waitInMs: Long?) {
        autoDismissJob?.cancel()
        if (waitInMs == null) return
        autoDismissJob = launch {
            delay(waitInMs)
            dismissProgress()
        }
    }
//    endregion
}