package com.example.kafedra.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kafedra.databinding.ActivityMainBinding
import com.example.kafedra.presentation.auth.RegAuthFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .add(binding.container.id, RegAuthFragment.newInstance(), RegAuthFragment.TAG)
                .commit()
        }
    }
}