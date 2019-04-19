package com.example.churrascometro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    var picanha: Double = 0.0
    var maminha: Double = 0.0
    var linguica: Double = 0.0
    var frango: Double = 0.0
    var arroz: Double = 0.0
    var batata: Double = 0.0
    var farofa: Double = 0.0
    var paes: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados :Bundle = intent.extras

        var homens = dados.getString("mens").toInt()
        var mulheres = dados.getString("womans").toInt()
        var criancas = dados.getString("kids").toInt()

        somaResultado(homens, mulheres, criancas)

    }

    fun somaResultado(homens: Int, mulheres: Int, criancas: Int) {

        picanha = (homens * 240.0) + (mulheres * 180.0) + (criancas * 120.0)
        maminha = (homens * 80.0) + (mulheres * 60.0) + (criancas * 40.0)
        linguica = (homens * 40.0) + (mulheres * 30.0) + (criancas * 20.0)
        frango = (homens * 40.0) + (mulheres * 30.0) + (criancas * 20.0)
        arroz = (homens * 100.0) + (mulheres * 80.0)
        batata = (homens * 200.0) + (mulheres * 150.0) + (criancas * 100.0)
        farofa = (homens * 100.0) + (mulheres * 80.0)
        paes = (homens * 1.5) + (mulheres * 1.5)

        text_Picanha.setText(picanha.toString() + "g")
        text_Maminha.setText(maminha.toString() + "g")
        text_lingui.setText(linguica.toString() + "g")
        text_frango.setText(frango.toString() + "g")
        text_Arroz.setText(arroz.toString() + "g")
        text_batata.setText(batata.toString() + "g")
        text_farofa.setText(farofa.toString() + "g")
        text_paes.setText(paes.toString() + "g")

        button_voltar.setOnClickListener {
            finish()

        }

    }

}
