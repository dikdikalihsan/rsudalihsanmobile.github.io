package com.rsudalihsan.mobilersudalihsan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsudalihsan.rsudalihsanmobile.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initActionBar()
    }

    private fun initActionBar() {
        var tbSignIn = null
        setSupportActionBar(tbSignIn)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

    }
}