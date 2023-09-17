package com.ramazanalarmandcalender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Kalma extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma);
        this.setTitle("Islamic Kalmay");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btn_firstkalma = (Button)findViewById(R.id.btn_firstkalma);
        btn_firstkalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kalma.this,FirstKalma.class);
                startActivity(intent);
            }
        });
        Button btn_secondkalma = (Button)findViewById(R.id.btn_secondkalma);
        btn_secondkalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kalma.this,SecondKalma.class);
                startActivity(intent);
            }
        });
        Button btn_thirdkalma = (Button)findViewById(R.id.btn_thirdkalma);
        btn_thirdkalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kalma.this,ThirdKalma.class);
                startActivity(intent);
            }
        });
        Button btn_fourthkalma = (Button)findViewById(R.id.btn_fourthkalma);
        btn_fourthkalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kalma.this,FourthKalma.class);
                startActivity(intent);
            }
        });
        Button btn_fifthkalma = (Button)findViewById(R.id.btn_fifthkalma);
        btn_fifthkalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kalma.this,FifthKalma.class);
                startActivity(intent);
            }
        });
        Button btn_sixthkalma = (Button)findViewById(R.id.btn_sixthkalma);
        btn_sixthkalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kalma.this,SixthKalma.class);
                startActivity(intent);
            }
        });
    }
}
