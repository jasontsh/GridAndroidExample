package com.jasontsh.interviewkickstart.gridlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.frame_layout)
        val manager:FragmentManager = supportFragmentManager
        manager.commit {
            add(R.id.frame_layout_container, ItemFragment())
        }
    }
}