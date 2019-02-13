package com.example.weatherapp.test

/**
 *  Kotlin内部类的使用
 */
class Outer {
    private val bar: Int = 1

    class Nested {
       open fun foo() = 2
    }

    //如果需要去访问外部类的成员，我们需要用 inner 声明这个类：
    inner class Nested2 {
        fun foo() = bar
    }
}