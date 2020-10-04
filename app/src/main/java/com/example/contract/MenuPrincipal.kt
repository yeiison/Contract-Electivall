package com.example.contract

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_login_contract.*
import kotlinx.android.synthetic.main.activity_menu_principal.*

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        //1. Crear la lista con el arreglo
        val servicios= arrayListOf("electricista", "mecanico", "constructor", "aseo domestrico", "aseo domestrico", "aseo domestrico")

        // 2. Crar un adaptador para el arreglo
        val adapter = ServiciosAdapter(this, R.layout.list_servicios, servicios)

        //3. Conectar la lista con el adaptador
        serviciosList.adapter=adapter

        btnReturnLogin.setOnClickListener { _ -> returnLogin() }


    }

    fun returnLogin() {
        val loginContract = Intent(this, LoginContract::class.java)
        startActivity(loginContract)
    }
}