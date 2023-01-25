package com.example.gamingstibproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_library.*
import kotlinx.android.synthetic.main.activity_main.*

class Library : AppCompatActivity() {
    val mataPelajaran =
        arrayOf(
            "Gta San Andreas",
            "Resident Evil",
            "Burnout",
            "Downhill",
            "Spiderman",
            "Black",
            "Gta V" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, mataPelajaran)
        listview.adapter = arrayAdapter
        listview.setOnItemClickListener{parent: AdapterView<*>?, view:View?,
                                        posisi: Int, id: Long ->
            Toast.makeText(
                this, "Klik id: "+(posisi+1)+" "+
                        mataPelajaran[posisi], Toast.LENGTH_SHORT
            ).show()
        }
    }
}