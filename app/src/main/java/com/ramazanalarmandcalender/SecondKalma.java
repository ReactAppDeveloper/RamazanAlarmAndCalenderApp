package com.ramazanalarmandcalender;

/**
 * Created by Cclub on 10/05/2018.
 */

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondKalma extends AppCompatActivity {

    Button forplay,forstop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_second_kalma);
        mediaPlayer = MediaPlayer.create(SecondKalma.this,R.raw.secondk);
        forplay = (Button)findViewById(R.id.play_button);

        forstop = (Button)findViewById(R.id.stop_button);


        forplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        forstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mediaPlayer.stop();
    }
}


