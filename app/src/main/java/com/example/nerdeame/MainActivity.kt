package com.example.nerdeame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SetUp
        setup()

    }

    //Aqui es donde tendremos lo referente a la funcionalidad y visualizacion de nuestro menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //Esto es lo que hace que se vea nuestro barra del toolbar
        menuInflater.inflate(R.menu.menu_controler_extension, menu)

        return super.onCreateOptionsMenu(menu)
    }

    private fun setup(){
        setupTable()
    }

    private fun setupTable(){}
}