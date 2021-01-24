package com.example.work21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val l = Toast.makeText(applicationContext,"Can't increase more than 9.", Toast.LENGTH_LONG)
        val s = Toast.makeText(applicationContext,"Can't decrease more than 0.", Toast.LENGTH_LONG)
        val j = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var count = 0

        buttonX.setOnClickListener(){
            if (count >= 0 && count < 9){
                count++
                textView1.setText("$count")
            }else{
                l.show()
            }
        }


        buttonY.setOnClickListener(){
            if (count > 0 && count <= 9){
                count--
                textView1.setText("$count")
            }else{
                s.show()
            }
        }


        buttonZ.setOnClickListener(){
            count = 0
            textView1.setText("$count")
            j.show()

        }
    }
}