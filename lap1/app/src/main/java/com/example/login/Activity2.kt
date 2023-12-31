package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import com.example.login.databinding.Activity2Binding
import com.google.firebase.auth.FirebaseAuth

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    private lateinit var user: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        user = FirebaseAuth.getInstance()

        if (user.currentUser != null) {
            user.currentUser?.let {

                binding.tvUserEmail.text = it.email
            }
        }

        binding.btnSignOut.setOnClickListener {
            user.signOut()
            startActivity(
                Intent(this, MainActivity::class.java)
            )
            finish()
        }

    }
}