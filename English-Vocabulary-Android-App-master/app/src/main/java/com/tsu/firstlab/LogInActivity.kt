package com.tsu.firstlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.firstlab.databinding.ActivityLogInBinding


class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.loginButton.setOnClickListener {
            if (binding.emailInputEditText.text.toString().isNotEmpty() &&
                binding.passwordInputEditText.text.toString().isNotEmpty()
            ) {
                val intent = Intent(this, MainMenuActivity::class.java)
                startActivity(intent)
            }
        }
        binding.backButton.setOnClickListener{
            super.onBackPressed()
        }
    }
}