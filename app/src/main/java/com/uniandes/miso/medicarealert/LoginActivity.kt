package com.uniandes.miso.medicarealert

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uniandes.miso.medicarealert.databinding.ActivityLoginBinding

class LoginActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener { login(this) }

        binding.txtNoTengoCuenta.setOnClickListener { loadRegistrationActivity(this ) }

        binding.txtOlvideMiClave.setOnClickListener { loadPasswordRecoveryActivity(this ) }

    }

    private fun login(context: Context) {
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        if (hasValidInputs(email, password)) {
            val intent = Intent(context, MiDia01Activity::class.java)
            context.startActivity(intent)
        }
        clearLoginText()
    }

    private fun loadRegistrationActivity(context: Context) {
        val intent = Intent(context, RegistrationActivity::class.java)
        context.startActivity(intent)
        clearLoginText()
        finish()
    }

    private fun loadPasswordRecoveryActivity(context: Context) {
        val intent = Intent(context, PasswordRecoveryActivity::class.java)
        context.startActivity(intent)
        clearLoginText()
        finish()
    }

    private fun hasValidInputs(email: String, password: String): Boolean {
        var isValidEmail = true
        var isValidPassword = true
        if(email.isEmpty()) {
            binding.etEmailLy.error = "Email requerido"
            isValidEmail = false
        }

        if(password.isEmpty()) {
            binding.etPasswordLy.error = "Password requerido"
            isValidPassword = false
        }

        return isValidEmail and isValidPassword;

    }

    private fun clearLoginText() {
        binding.etEmail.setText("")
        binding.etPassword.setText("")
    }

}