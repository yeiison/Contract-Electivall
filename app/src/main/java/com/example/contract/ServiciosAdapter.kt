package com.example.contract

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import java.security.AccessControlContext

class ServiciosAdapter(context: Context, val layout: Int, val data: ArrayList<String>)
    : ArrayAdapter<String> (context, layout ,data){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //1. Buscamos el dato que queremos mostrar
        val titulo = data [position]
        //2. Creamos el view que se va a mostrar
        val inflater=
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(layout, parent, false)
        //3. retornamos el view
        return view
    }
}