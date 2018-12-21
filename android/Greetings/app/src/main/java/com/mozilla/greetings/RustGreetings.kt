package com.mozilla.greetings

class RustGreetings {

    private external fun greeting(pattern: String): String

    fun sayHello(to: String): String {
        return greeting(to)
    }
}