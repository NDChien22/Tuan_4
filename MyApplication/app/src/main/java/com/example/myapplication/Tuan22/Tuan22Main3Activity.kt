package com.example.myapplication.Tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class Tuan22Main3Activity : AppCompatActivity() {
    var lv:ListView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main3)

        lv = findViewById(R.id.tuan22lv);
        val arr = arrayOf("item1","item2","item3","so4","item 5","so6","7");
        val ad = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,arr);

        lv!!.adapter = ad;
    }
}