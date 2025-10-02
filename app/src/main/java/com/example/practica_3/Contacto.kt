package com.example.practica_3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contacto (val id:Int, val nombre:String, val telefono:String) : Parcelable

