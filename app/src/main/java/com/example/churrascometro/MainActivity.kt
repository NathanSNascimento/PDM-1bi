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

            var qtdHomens = edit_homens.text.toString()
            var qtdMulheres = edit_mulher.text.toString()
            var qtdCriancas = edit_Crianca.text.toString()

            if(qtdHomens.equals("") && (qtdMulheres.equals("") && (qtdCriancas.equals(""))) ){
                text_aviso.setText("Informe ao menos um campo. Pois um churrasco sem pessoas terá a mesma " +
                        "quantidade de ingredientes que você tem de amigos: ZERO.");
            } else {
                if(qtdHomens.equals("")){
                    qtdHomens = 0.toString()
                }
                if(qtdMulheres.equals("")) {
                    qtdMulheres = 0.toString()
                }
                if(qtdCriancas.equals("")){
                    qtdCriancas = 0.toString()
                }
            }

            intent.putExtra("mens", qtdHomens)
            intent.putExtra("womans", qtdMulheres)
            intent.putExtra("kids", qtdCriancas)

            if ((qtdHomens != "") && (qtdMulheres != "") && (qtdCriancas != "")){
                text_aviso.setText("")
                startActivity(intent)
            } else {
                text_aviso.setText("Informe ao menos um campo. Pois um churrasco sem pessoas terá a mesma " +
                        "quantidade de ingredientes que você tem de amigos: ZERO.");
            }



        }

    }
}
