package com.rsudalihsan.mobilersudalihsan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsudalihsan.rsudalihsanmobile.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initActionBar()
    }

    private fun initActionBar() {
        var tbSignUp = null
        setSupportActionBar(tbSignUp)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}