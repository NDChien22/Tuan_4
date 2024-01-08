package com.example.myapplication.Tuan412

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Tuan412MainActivity : AppCompatActivity() {
    var btn:Button? =null
    var tv:TextView? = null
    var context:Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan412_main)
        btn = findViewById(R.id.tuan412btn)
        tv = findViewById(R.id.tuan412tv)
        val fn = VolleyKotlinFn()
        btn!!.setOnClickListener {
            fn.getJsonArrayObjects(context,tv!!)
        }
    }
}