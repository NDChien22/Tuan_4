package com.example.myapplication.Tuan32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);

        lv = findViewById(R.id.tuan32lv);
        //tao nguon du lieu
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Tran Van D","19",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Vu Van C","16",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Thi D","22",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));

        // tao adapter
        adapter = new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}