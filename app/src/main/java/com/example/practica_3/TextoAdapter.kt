package com.example.practica_3

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextoAdapter(private val listaTextos: List<String>, private val onItemClick: (String) -> Unit) : RecyclerView.Adapter<TextoAdapter.TextoViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TextoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.newlayout, parent, false)
        return TextoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TextoViewHolder, position: Int) {
        holder.bind(listaTextos[position], onItemClick)
    }

    override fun getItemCount(): Int {
        return listaTextos.size
    }

    class TextoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val tvTexto : TextView = itemView.findViewById(R.id.textView)

        fun bind(texto: String, funcion :(String) -> Unit){

            itemView.setOnClickListener{
                funcion(texto)
            }

            tvTexto.text = texto

        }
    }


}
