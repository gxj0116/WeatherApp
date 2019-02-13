package com.example.weatherapp.test

import com.example.weatherapp.R

/**
 * 枚举可以带有参数
 */
enum class Icon(val res: Int) {
    UP(R.string.str_up),
    SEARCH(R.string.str_search),
    CAST(R.string.str_cast)
}
val searchIconRes = Icon.SEARCH.res

//每一个枚举都有一些函数来获取它的名字、声明的位置：
val searchName: String = Icon.SEARCH.name
val searchPosition: Int = Icon.SEARCH.ordinal