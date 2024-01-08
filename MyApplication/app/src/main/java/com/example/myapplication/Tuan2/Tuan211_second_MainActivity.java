package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan211_second_MainActivity extends AppCompatActivity {
    TextView tv;
    Button scbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan211_second_main);

        tv = findViewById(R.id.tuan21tv1);
        scbtn = findViewById(R.id.btn11);
        //don du lieu
        Intent i1 = getIntent();
        //do hang
        String chuoi1 = i1.getExtras().getString("so1");
        String chuoi2 = i1.getExtras().getString("so2");

        float so1 = Float.parseFloat(chuoi1);
        float so2 = Float.parseFloat(chuoi2);
        float tong = so1 + so2;

        tv.setText(String.valueOf(tong));

        scbtn.setOnClickListener(v->{
            Intent i = new Intent(Tuan211_second_MainActivity.this,
                    Tuan211_MainActivity.class);
            startActivity(i);
        });

    }
}