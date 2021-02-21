package com.orechou.library.base.log

import android.util.Log

object Log {

    fun d(tag: Tag, msg: String, tr: Throwable? = null) {
        Log.d(tag.toString(), msg, tr)
    }

    class Tag(private val name: String) {
        override fun toString(): String {
            return name
        }
    }

}