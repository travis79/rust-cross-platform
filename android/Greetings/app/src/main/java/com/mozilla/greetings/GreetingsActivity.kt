package com.mozilla.greetings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greetings.*


class GreetingsActivity : AppCompatActivity() {

    // Not sure if this is the best way to go about loading the library in Kotlin, but this was a way
    // I came up with to do it when converting from Java to Kotlin in the example.
    companion object {
        val lib = System.loadLibrary("greetings");
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        val g = RustGreetings()
        val r = g.sayHello("world")
        greetingField.text = r
    }
}
