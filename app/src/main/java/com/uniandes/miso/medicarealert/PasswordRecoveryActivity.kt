package com.uniandes.miso.medicarealert

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uniandes.miso.medicarealert.databinding.ActivityPasswordRecoveryBinding

class PasswordRecoveryActivity: AppCompatActivity() {

    private lateinit var binding: ActivityPasswordRecoveryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPasswordRecoveryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtNoTengoCuenta.setOnClickListener { loadLoginActivity(this ) }

    }

    private fun loadLoginActivity(context: Context) {
        val intent = Intent(context, LoginActivity::class.java)
        context.startActivity(intent)
        finish()
    }
}