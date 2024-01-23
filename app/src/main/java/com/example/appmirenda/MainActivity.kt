package com.example.appmirenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import com.example.appmirenda.R.layout


@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        //********les parcelable********

        val User = user("mirenda",23)

        val button = findViewById<Button>(R.id.infoUser)
        button.setOnClickListener {
        val intent =Intent(this,MainActivity2::class.java)
           intent.putExtra("user",User)
            startActivity(intent)
        }

        //*******fonction incrementation/ decrementation**********

        val textViewChrono = findViewById<TextView>(R.id.textViewChrono) as TextView
        val ajoute = findViewById<Button>(R.id.btnAjouter)
        val diminue= findViewById<Button>(R.id.btnDiminuer)

        ajoute.setOnClickListener{
            var contenu = textViewChrono.text.toString().toInt()
            contenu++
            textViewChrono.text= contenu.toString()

        }
        diminue.setOnClickListener{
            var contenu = textViewChrono.text.toString().toInt()
            contenu--
            textViewChrono.text= contenu.toString()

        }


        var toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar) as androidx.appcompat.widget.Toolbar
        setSupportActionBar(toolbar)
    }

    //******** option menu ******

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
menuInflater.inflate(R.menu.mainmenu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_add -> {

                Toast.makeText(this,"ajouter",Toast.LENGTH_SHORT).show()
            }
            R.id.action_delete -> {

                Toast.makeText(this,"suprimer",Toast.LENGTH_SHORT).show()
            }
            R.id.action_search -> {

                Toast.makeText(this,"aide",Toast.LENGTH_SHORT).show()
            }
        }
        return true

        // recycleview


    }



}