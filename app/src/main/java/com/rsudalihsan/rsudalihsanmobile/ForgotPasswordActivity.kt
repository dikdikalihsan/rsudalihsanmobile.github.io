package com.rsudalihsan.mobilersudalihsan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsudalihsan.rsudalihsanmobile.R

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        initActionBar()
    }

    private fun initActionBar() {
        var tbForgotPassword = null
        setSupportActionBar(tbForgotPassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}