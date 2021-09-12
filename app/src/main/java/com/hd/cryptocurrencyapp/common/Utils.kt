package com.hd.cryptocurrencyapp.common

import android.util.Log

fun String.log(tag: String = "LOG_TAG") {
    Log.i(tag, this)
}