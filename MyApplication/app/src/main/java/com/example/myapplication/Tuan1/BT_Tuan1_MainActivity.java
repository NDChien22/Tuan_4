package com.example.myapplication.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class BT_Tuan1_MainActivity extends AppCompatActivity {

    //khai bao control
    EditText txt1,txt2;
    Button btn1;
    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_tuan1_main);
        //anh xa cac control
        txt1 = findViewById(R.id.demo1txt1);
        txt2 = findViewById(R.id.demo1txt2);
        btn1 = findViewById(R.id.demo1btn1);
        tv1 = findViewById(R.id.demo1Tv1);
        //xu ly su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhTong();
        });
    }

    //dinh nghia ham tinh tong
    private void tinhTong() {
        //lay du lieu dau vao tu editText
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1);

        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);

        //tinh tong
        float tong = so1 + so2;

        //in ket qua
        tv1.setText(String.valueOf(tong));
    }
}