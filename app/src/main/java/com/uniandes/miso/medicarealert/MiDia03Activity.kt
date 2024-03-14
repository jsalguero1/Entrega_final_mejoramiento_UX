package com.uniandes.miso.medicarealert

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uniandes.miso.medicarealert.databinding.ActivityMiDia03Binding

class MiDia03Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMiDia03Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMiDia03Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}