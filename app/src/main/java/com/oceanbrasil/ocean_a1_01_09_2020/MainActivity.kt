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

        /*
        Desafio
        1. Reconstruir o projeto apresentado em aula (sem copiar e colar o código, mas pode usar de referência)
        2. Criar uma Activity
        3. Adicionar um elemento de visualização de texto para exibição do resultado
        4. Adicionar dois elementos de edição de texto, um para o nome e outro para a idade
        5. Adicionar dois botões, um para enviar e outro para limpar
        6. Quando clicar no botão enviar, fazer uma validação se todos os campos foram digitados
        7. Se a validação passar, atualizar o elemento de visualização de texto para: "Olá NOME, você tem IDADE anos."
        8. Caso não passe, atualizar o elemento de edição de texto problemático com uma mensagem de erro
        9. Ao clicar no botão limpar, limpa todos os itens do formulário
        10. Adicione todos os recursos de texto ao arquivo de strings.xml
        11. Traduz o app para inglês e português
        12. E todos os recursos de cores ao arquivo de colors.xml
        */
    }
}
