package com.example.jogo_da_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jogo_da_velha.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o botão para abrir MainActivity1
        binding.buttonMulti.setOnClickListener {
            val intent = Intent(this, MultiplayerActivity::class.java)
            startActivity(intent)
        }

        // Configurando o botão para abrir MainActivity2
        binding.buttonSingle.setOnClickListener {
            val intent = Intent(this, SingleplayerActivity::class.java)
            startActivity(intent)
        }

        binding.buttonSair.setOnClickListener {
            finish()
        }
    }
}