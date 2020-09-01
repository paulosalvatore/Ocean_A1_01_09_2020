package com.oceanbrasil.ocean_a1_01_09_2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Exemplo 1
//        tvNome.text = "Paulo Salvatore"

        // Exemplo 2
//        btAtualizar.setOnClickListener {
//            tvNome.text = "Paulo Salvatore"
//        }

        // Exemplo 3
//        btAtualizar.setOnClickListener {
//            tvNome.text = etNome.text
//        }

        // Exemplo 4
//        btAtualizar.setOnClickListener {
//            if (etNome.text.isBlank()) {
//                etNome.error = "Digite um nome válido"
//            } else {
//                tvNome.text = etNome.text
//            }
//        }

        // Exemplo 5
//        btLimpar.setOnClickListener {
//            etNome.text.clear()
//            tvNome.text = "Paulo Salvatore"
//        }

        // Exemplo 6
        btLimpar.setOnClickListener {
            etNome.text.clear()
            tvNome.text = getString(R.string.hint_nome)
        }

        // Exemplo 7
        btAtualizar.setOnClickListener {
            if (etNome.text.isBlank()) {
                etNome.error = getString(R.string.error_nome)
            } else {
                tvNome.text = etNome.text
            }
        }
    }
}
