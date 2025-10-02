package com.example.practica_3

import androidx.lifecycle.ViewModel
import kotlinx.parcelize.Parcelize

class ViewModelContacto:ViewModel() {

    private var lista: MutableList<Contacto> = MutableList(30) { i ->
        Contacto(i, "Juan", "182828")
    }

    fun getContactos():List<Contacto>{
        return lista
    }


    fun insertarContacto(contacto : Contacto){
        lista.add(contacto)
    }
}