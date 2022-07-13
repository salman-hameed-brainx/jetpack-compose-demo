package com.mobile.goal.common

import android.content.Context
import android.content.Intent
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.mobile.goal.R
import com.mobile.goal.domain.model.Participant
import java.lang.reflect.Modifier


object AppUtils {

    fun getJson(anyObject: Any): String {
        return Gson().toJson(anyObject)
    }

    fun getObjectFromJson(jsonObject: String?, mappingClass: Class<*>): Any? {
        jsonObject ?: return null
        return Gson().fromJson(jsonObject, mappingClass)
    }

    fun getUserName(participant: Participant?): String {
        var fullName = ""

        participant?.apply {
            fullName = "$first_name $last_name"
        } ?: run { fullName = "No Name Found" }

        return fullName
    }

    fun toJson(data: Any): String {
        val builder = GsonBuilder()
        builder.excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
        val gSon = builder.create()
        return gSon.toJson(data)
    }

    fun shareText(context: Context?, text: String) {

        Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            putExtra(Intent.EXTRA_TITLE, context?.getString(R.string.app_name))
            type = "text/plain"

            Intent.createChooser(this, null)
            context?.startActivity(this)
        }
    }
}