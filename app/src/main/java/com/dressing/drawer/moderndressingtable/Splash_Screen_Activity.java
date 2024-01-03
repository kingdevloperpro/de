package com.dressing.drawer.moderndressingtable;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash_Screen_Activity.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }
}