package br.com.rafael.podedirigir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        txvSaudacao.text = "Seja bem vindo ${intent.getStringExtra("Nome")}"

    }
}
