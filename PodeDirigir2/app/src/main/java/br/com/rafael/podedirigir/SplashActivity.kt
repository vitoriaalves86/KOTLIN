package br.com.rafael.podedirigir

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            //Criando a intent
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            //Executar a intent
            startActivity(intent)
        }, 5000)


    }
}