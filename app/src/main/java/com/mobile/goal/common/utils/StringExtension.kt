package com.mobile.goal.common.utils

import android.net.Uri
import org.json.JSONObject
import retrofit2.HttpException


fun String?.getNextPageNumber(): Int? {
    return Uri.parse(this).getQueryParameter("page")?.toInt()
}

fun String?.getErrorMsg(): String {
    this?.let {
        return JSONObject(it).getString("error")
    } ?: return ""
}

fun HttpException.getErrorMsg(): String? {

    return response()?.errorBody()?.string()?.getErrorMsg()
}