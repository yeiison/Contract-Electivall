package com.example.contract

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buscar_prestador_servicio.*
import kotlinx.android.synthetic.main.activity_menu_principal.*

class BuscarPrestadorServicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_prestador_servicio)

        btnReturnMain.setOnClickListener { _ -> returnMain() }

    }

    fun returnMain() {
        val menuPrincipal = Intent(this, MenuPrincipal::class.java)
        startActivity(menuPrincipal)
    }

}