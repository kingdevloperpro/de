package com.dressing.drawer.moderndressingtable.two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dressing.drawer.moderndressingtable.R;

public class Two_Activity extends AppCompatActivity {

    ImageView btn_HomeDesign_1;
    ImageView btn_HomeDesign_10;
    ImageView btn_HomeDesign_11;
    ImageView btn_HomeDesign_12;
    ImageView btn_HomeDesign_13;
    ImageView btn_HomeDesign_14;
    ImageView btn_HomeDesign_15;
    ImageView btn_HomeDesign_16;
    ImageView btn_HomeDesign_2;
    ImageView btn_HomeDesign_3;
    ImageView btn_HomeDesign_4;
    ImageView btn_HomeDesign_5;
    ImageView btn_HomeDesign_6;
    ImageView btn_HomeDesign_7;
    ImageView btn_HomeDesign_8;
    ImageView btn_HomeDesign_9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_home_design);

        btn_HomeDesign_1 = (ImageView) findViewById(R.id.btn_HomeDesign_1);
        btn_HomeDesign_2 = (ImageView) findViewById(R.id.btn_HomeDesign_2);
        btn_HomeDesign_3 = (ImageView) findViewById(R.id.btn_HomeDesign_3);
        btn_HomeDesign_4 = (ImageView) findViewById(R.id.btn_HomeDesign_4);
        btn_HomeDesign_5 = (ImageView) findViewById(R.id.btn_HomeDesign_5);
        btn_HomeDesign_6 = (ImageView) findViewById(R.id.btn_HomeDesign_6);
        btn_HomeDesign_7 = (ImageView) findViewById(R.id.btn_HomeDesign_7);
        btn_HomeDesign_8 = (ImageView) findViewById(R.id.btn_HomeDesign_8);
        btn_HomeDesign_9 = (ImageView) findViewById(R.id.btn_HomeDesign_9);
        btn_HomeDesign_10 = (ImageView) findViewById(R.id.btn_HomeDesign_10);
        btn_HomeDesign_11 = (ImageView) findViewById(R.id.btn_HomeDesign_11);
        btn_HomeDesign_12 = (ImageView) findViewById(R.id.btn_HomeDesign_12);
        btn_HomeDesign_13 = (ImageView) findViewById(R.id.btn_HomeDesign_13);
        btn_HomeDesign_14 = (ImageView) findViewById(R.id.btn_HomeDesign_14);
        btn_HomeDesign_15 = (ImageView) findViewById(R.id.btn_HomeDesign_15);
        btn_HomeDesign_16 = (ImageView) findViewById(R.id.btn_HomeDesign_16);


        btn_HomeDesign_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_3.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_4.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_5.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_6.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_7.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_8.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_9.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_10.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_11.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_12.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_13.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_14.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_15.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        btn_HomeDesign_16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Two_Activity.this, Two_16.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Two_Activity.this.startActivity(intent);
            }
        });
        

    }
}