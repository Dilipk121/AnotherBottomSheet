package com.example.anotherbottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_open = findViewById<Button>(R.id.btn_open)


        btn_open.setOnClickListener(){

            val dialog = BottomSheetDialog(this)
            val viemM = layoutInflater.inflate(R.layout.bottom_sheet_layout,null)

            val btn_dismiss = viemM.findViewById<Button>(R.id.btn_dismiss)

            btn_dismiss.setOnClickListener(){

                dialog.dismiss() // closing the dialog
            }
            dialog.setCancelable(false) // its prevent anywhere click to dismiss
            dialog.setContentView(viemM)
            dialog.show()

        }

    }

/*    fun openBottomSheetDialog(view: View) {

        val dialog = BottomSheetDialog(this)
        val viemM = layoutInflater.inflate(R.layout.bottom_sheet_layout,null)

        val btn_dismiss = viemM.findViewById<Button>(R.id.btn_dismiss)

        btn_dismiss.setOnClickListener(){

            dialog.dismiss() // closing the dialog
        }
        dialog.setCancelable(false)
        dialog.setContentView(viemM)
        dialog.show()



    }*/
}