package com.example.weatherapp.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapp.R
import com.example.weatherapp.utils.ToastUtils

import kotlinx.android.synthetic.main.activity_test.*;

/**
 * @TODO 用于测试的Activity
 */
class TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test);

        //给TextView设置内容
        first.text = getContent();
        second.text = getContent("Hello", "Java");

        //给Button设置点击事件
        toast.setOnClickListener {
            ToastUtils.showToast(this, getString(R.string.toast_tip));
        }

    }

    /**
     * 无参函数
     */
    private fun getContent(): CharSequence? {
        return "Hello Kotlin"
    }

    /**
     * 带参函数
     */
    private fun getContent(baseParam: String, language: String): CharSequence? {
        return baseParam + " " + language
    }
}
