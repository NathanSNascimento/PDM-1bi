package com.example.churrascometro

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Bundle = intent.extras
        val men = dados.getInt("mens")

    }
}
