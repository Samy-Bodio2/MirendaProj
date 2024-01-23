package com.example.appmirenda

import android.app.Dialog
import android.content.DialogInterface
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment


class confirmeDeleteDialogue : DialogFragment() {

    @Suppress("DEPRECATION")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setMessage("suprimer les information personnel?")
            .setPositiveButton(/* text = */ "oui",null)
            .setNegativeButton("non non non",DialogInterface.OnClickListener{

              dialog, id -> Log.i("youpi","bon onle fera prochainement")
               // Toast.makeText(this,"vous avez accepter la supresion de votinformation", Toast.LENGTH_LONG,).show()
            })
        return builder.create()
    }

}