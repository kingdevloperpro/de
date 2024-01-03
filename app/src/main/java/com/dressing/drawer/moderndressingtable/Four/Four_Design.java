package com.dressing.drawer.moderndressingtable.Four;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dressing.drawer.moderndressingtable.R;

public class Four_Design extends AppCompatActivity {

    ImageView btn_DressingDesign_1;
    ImageView btn_DressingDesign_2;
    ImageView btn_DressingDesign_3;
    ImageView btn_DressingDesign_4;
    ImageView btn_DressingDesign_5;
    ImageView btn_DressingDesign_6;
    ImageView btn_DressingDesign_7;
    ImageView btn_DressingDesign_8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_interior_design);

        this.btn_DressingDesign_1 = (ImageView) findViewById(R.id.btn_DressingDesign_1);
        this.btn_DressingDesign_2 = (ImageView) findViewById(R.id.btn_DressingDesign_2);
        this.btn_DressingDesign_3 = (ImageView) findViewById(R.id.btn_DressingDesign_3);
        this.btn_DressingDesign_4 = (ImageView) findViewById(R.id.btn_DressingDesign_4);
        this.btn_DressingDesign_5 = (ImageView) findViewById(R.id.btn_DressingDesign_5);
        this.btn_DressingDesign_6 = (ImageView) findViewById(R.id.btn_DressingDesign_6);
        this.btn_DressingDesign_7 = (ImageView) findViewById(R.id.btn_DressingDesign_7);
        this.btn_DressingDesign_8 = (ImageView) findViewById(R.id.btn_DressingDesign_8);


        this.btn_DressingDesign_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_3.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_4.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_5.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_6.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_7.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Four_Design.this, Four_8.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Four_Design.this.startActivity(intent);
            }
        });
    }
}