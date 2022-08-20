package com.krishna.jaya.demoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("nkjcdnlkml;cds")
        println("some local changes with out commiting we are checking out" +
                "so it will stash the changes and" +
                " when we return it will unstash changes")
    }
}