package com.uniandes.miso.medicarealert

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uniandes.miso.medicarealert.databinding.ActivityMiDia02Binding

class MiDia02Activity: AppCompatActivity() {

    private lateinit var binding: ActivityMiDia02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMiDia02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCompartirWsp.setOnClickListener { loadMiDia03Activity(this ) }

    }

    private fun loadMiDia03Activity(context: Context) {
        val intent = Intent(context, MiDia03Activity::class.java)
        context.startActivity(intent)
        finish()
    }

}