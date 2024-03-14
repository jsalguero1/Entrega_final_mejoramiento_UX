package com.uniandes.miso.medicarealert

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uniandes.miso.medicarealert.databinding.ActivityMiDia01Binding

class MiDia01Activity: AppCompatActivity() {

    private lateinit var binding: ActivityMiDia01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMiDia01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCompartirCodigo.setOnClickListener { loadMiDia02Activity(this ) }

    }

    private fun loadMiDia02Activity(context: Context) {
        val intent = Intent(context, MiDia02Activity::class.java)
        context.startActivity(intent)
        finish()
    }
}