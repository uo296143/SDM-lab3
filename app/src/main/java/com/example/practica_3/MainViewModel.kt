package com.example.practica_3

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private var lista:List<String> = List(30){i -> "Es el elemento $i"}

    fun devolverLista():List<String>{
        return lista
    }
}