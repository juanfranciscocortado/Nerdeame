package com.example.nerdeame

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReciclerViewExtension(var context: Context, element: ArrayList<>):RecyclerView.Adapter<ReciclerViewExtension.ViewHolder>() {

    fun configure(){}

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReciclerViewExtension.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ReciclerViewExtension.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder(vista: View, listener: ClickListener, longClick: LongClick):RecyclerView.ViewHolder(vista), View.OnClickListener, View.OnLongClickListener{
        var vista = vista
        var foto: ImageView? = null
        var nombre: TextView? = null
        var precio: TextView? = null
        var rating: RatingBar? = null
        var listener:ClickListener? = null
        var longListener:LongClick? = null

        init {
            this.foto = vista.findViewById(R.id.iv_foto)
            this.nombre = vista.findViewById(R.id.tv_nombre)
            this.precio = vista.findViewById(R.id.tv_precio)
            this.rating = vista.findViewById(R.id.rb_valoracion)

            this.listener = listener
            this.longListener = longClick

            vista.setOnClickListener(this)
            vista.setOnLongClickListener(this)
        }

        override fun onClick(v: View?) {
            this.listener?.onClick(v!!, adapterPosition)
        }

        override fun onLongClick(v: View?): Boolean {
            this.longListener?.longClick(v!!, adapterPosition)
            return true
        }
    }
}