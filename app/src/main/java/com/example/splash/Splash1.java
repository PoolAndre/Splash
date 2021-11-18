package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash1 extends AppCompatActivity {
    public static final long SPLAH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        //implementar tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(Splash1.this, Splash.class);
                startActivity(intent);
                finish();
            }
        };
        // se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time,SPLAH_SCREEN_DELAY);
    }
}