package com.example.elasz.kol_probne1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Kawa> kawy= new ArrayList<>();
        kawy.add(new Kawa("Latte","12"));
        kawy.add(new Kawa("Cappucino","8"));
        kawy.add(new Kawa("Espresso","6"));
        kawy.add(new Kawa("Americana","10"));
    }
}
