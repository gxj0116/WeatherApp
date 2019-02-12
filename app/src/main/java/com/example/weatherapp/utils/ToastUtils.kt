package com.example.weatherapp.utils

import android.content.Context;
import android.text.InputFilter
import android.widget.Toast


class ToastUtils {

    /**
     * kotlin中的静态代码
     */
    companion object {
        fun showToast(context: Context?, message: CharSequence, length: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context, message, length).show();
        }
    }
}