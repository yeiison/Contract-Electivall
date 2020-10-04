package com.example.contract

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_contract.*

class LoginContract : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_contract)

        btnIniciarSesion.setOnClickListener { _ ->  iniciarSesion()}
    }

    fun iniciarSesion() {
        val menuPrincipal = Intent(this, MenuPrincipal::class.java)
        startActivity(menuPrincipal)
    }
}