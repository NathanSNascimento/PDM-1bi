package com.example.churrascometro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calc.setOnClickListener{

            val intent = Intent(applicationContext, ResultadoActivity::class.java)

            val qtdHomens = edit_homens.text.toString()
            val qtdMulheres = edit_mulher.text.toString()
            val qtdCriancas = edit_Crianca.text.toString()

            intent.putExtra("mens", qtdHomens)
            intent.putExtra("womans", qtdMulheres)
            intent.putExtra("kids", qtdCriancas)

            startActivity(intent)
        }

    }
}
