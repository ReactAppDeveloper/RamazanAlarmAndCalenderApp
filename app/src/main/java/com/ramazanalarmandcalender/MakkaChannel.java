package com.ramazanalarmandcalender;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import android.content.Context;
import android.os.Vibrator;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class MakkaChannel extends AppCompatActivity{

    Vibrator mVibrator;
    boolean isTureVibrator =true;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makka_channel);
        this.setTitle("Tasbeeh");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView myTextView = (TextView) findViewById(R.id.textAd);
        final ImageButton resftz = (ImageButton)findViewById(R.id.restz);
        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        myTextView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isTureVibrator){ mVibrator.vibrate(100);}

                count++;
                myTextView.setText( ""+count);

            }
        });
        resftz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isTureVibrator){ mVibrator.vibrate(100);}
                count = 0;
                myTextView.setText( ""+count);
            }
        });
    }
}
