package com.anwesh.uiprojects.linkedstepmovebarview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.stepmovebarview.StepMoverBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StepMoverBarView.create(this)
    }
}
