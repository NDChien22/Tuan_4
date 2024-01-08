package com.example.myapplication.Tuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Tuan22SecondMainActivity : AppCompatActivity() {
    var tv1:TextView? = null;
    var btn:Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_second_main)

        tv1 = findViewById(R.id.tuan22tv1);
        btn = findViewById(R.id.klbtn);
        var i1 =intent;
        val chuoi1 = i1.extras!!.getString("so1");
        val chuoi2 = i1.extras!!.getString("so2");

        val so1 = chuoi1!!.toFloat();
        val so2 = chuoi2!!.toFloat();

        val tong  = so1 + so2;

        tv1!!.text = tong.toString()

        btn!!.setOnClickListener(View.OnClickListener {
            var ikl = Intent(this@Tuan22SecondMainActivity,
                Tuan22MainActivity::class.java);
            startActivity(ikl);
        })

    }
}