package com.ramazanalarmandcalender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        Button btn_salaat = (Button)findViewById(R.id.btn_salaat);
        btn_salaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,SalaatTimesActivity.class);
                startActivity(intent);
            }
        });
        Button btn_ramazan_calender = (Button)findViewById(R.id.btn_ramazan_calender);
        btn_ramazan_calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,RamazanCalender.class);
                startActivity(intent);
            }
        });
        Button btn_hijri_calender = (Button)findViewById(R.id.btn_hijri_calender);
        btn_hijri_calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,HijriCalender.class);
                startActivity(intent);
            }
        });
        Button btn_qibla = (Button)findViewById(R.id.btn_qibla);
        btn_qibla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,QIblaFinder.class);
                startActivity(intent);
            }
        });
        Button btn_duas = (Button)findViewById(R.id.btn_duas);
        btn_duas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,DuaGroupActivity.class);
                startActivity(intent);
            }
        });
        Button btn_videos = (Button)findViewById(R.id.btn_videos);
        btn_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,MakkaChannel.class);
                startActivity(intent);
            }
        });
        Button btn_allahnames = (Button)findViewById(R.id.btn_allahnames);
        btn_allahnames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,AllahNames.class);
                startActivity(intent);
            }
        });
        Button btn_kalmay = (Button)findViewById(R.id.btn_kalmay);
        btn_kalmay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,Kalma.class);
                startActivity(intent);
            }
        });
        Button btn_quran_ayat = (Button)findViewById(R.id.btn_quran_ayah);
        btn_quran_ayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingActivity.this,QuranAyat.class);
                startActivity(intent);
            }
        });
    }
}
