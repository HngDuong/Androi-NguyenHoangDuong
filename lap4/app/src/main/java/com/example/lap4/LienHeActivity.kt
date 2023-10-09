package com.example.lap4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lap4.databinding.ActivitiLienHeBinding


class LienHeActivity : AppCompatActivity() {
    private lateinit var binding: ActivitiLienHeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitiLienHeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //button imgfb
        binding.imgfb.setOnClickListener{
            openUrl("https://www.facebook.com/https://www.facebook.com/nguyenhoang.duong.90663")
        }
        //button imgdiscord
        binding.imgdiscord.setOnClickListener{
            openUrl("https://discord.com/channels/@me")
        }
        //button imggifhub
        binding.imggifhub.setOnClickListener{
            openUrl("https://github.com/HngDuong/Androi-NguyenHoangDuong")
        }
        //quay lai main
        binding.bntback4.setOnClickListener {
            val i7= Intent(this, MainActivity::class.java)
            startActivity(i7)
        }

    }
    private fun openUrl(link: String){

        val uri = Uri.parse(link)
        val i6 = Intent(Intent.ACTION_VIEW, uri)
        startActivity(i6)

    }
}