package com.ramazanalarmandcalender;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Cclub on 14/05/2018.
 */

public class Start extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start);
        SharedPreferences prefre=this.getSharedPreferences("firstt", Context.MODE_PRIVATE);
        boolean firsttimes=prefre.getBoolean("firstt", true);
        if(firsttimes)
        {
            SharedPreferences.Editor editere=prefre.edit();
            editere.putBoolean("firstt", false);
            editere.commit();
           Thread thread=new Thread()
            {
                @Override
                public void run()
                {
                    super.run();

                    synchronized (this)
                    {
                        try {
                            wait(2000);
                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                        finally
                        {
                            finish();
                            Intent intent = new Intent(Start.this,Splash.class);
                            startActivity(intent);
                        }
                    }
                }
            };
            thread.start();
        }
        else
        {
            //MainActivity.this.finishActivity(0);
            startActivity(new Intent(Start.this, Splash.class));
        }

    }
}

