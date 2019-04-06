package com.example.churrascometro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Bundle = intent.extras
        val qtdHomem = dados.getInt("numero")
    }
}
