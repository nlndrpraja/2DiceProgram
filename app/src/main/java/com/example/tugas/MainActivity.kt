package com.example.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombolPutar:Button = findViewById(R.id.b_roll)
        tombolPutar.setOnClickListener{putar_dadu()}
        }
    private fun putar_dadu()  {
        //Toast.makeText(this , "hallo",Toast.LENGTH_LONG).show()
        val angkadadu1= (1..6).random()
        val angkadadu2= (1..6).random()
        val hasil: ImageView = findViewById(R.id.gambar_dadu)
        val hasil2: ImageView = findViewById(R.id.gambar_dadu2)
        val gambarHasil = when (angkadadu1){
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }
        val gambarHasil2 = when (angkadadu2){
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }
        hasil.setImageResource(gambarHasil)
        hasil2.setImageResource(gambarHasil2)
    }
}