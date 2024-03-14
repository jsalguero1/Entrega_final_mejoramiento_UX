package com.uniandes.miso.medicarealert

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uniandes.miso.medicarealert.databinding.ActivityRegistrationBinding

class RegistrationActivity: AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtYaTengoCuenta.setOnClickListener { loadLoginActivity(this ) }

    }

    private fun loadLoginActivity(context: Context) {
        val intent = Intent(context, LoginActivity::class.java)
        context.startActivity(intent)
        finish()
    }
}