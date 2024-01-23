package com.example.appmirenda

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import kotlin.math.log

class MainActivity2 : AppCompatActivity() {
    @Suppress("DEPRECATION")
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // les parcelable

        val user = intent.getParcelableExtra<user>(/* name = */ "user")

        val textviename = findViewById<TextView>(R.id.name) as TextView
        val textviewage = findViewById<TextView>(R.id.age) as TextView
        textviename.setText("NOM: ${user!!.name}")
        textviewage.setText("age: ${user!!.age}")

        //les dialogues dialogues
        val btn_dialogue= findViewById<TextView>(R.id.btnDialogue)
        btn_dialogue.setOnClickListener{
            Toast.makeText(this,"vous avez accepter la supression de vos informations!",Toast.LENGTH_LONG,).show()

            val fragment = confirmeDeleteDialogue()
            fragment.show(supportFragmentManager,"confirmDeleteDialog")
        }
    }
}