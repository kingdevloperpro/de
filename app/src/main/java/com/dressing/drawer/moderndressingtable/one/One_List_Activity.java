package com.dressing.drawer.moderndressingtable.one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.dressing.drawer.moderndressingtable.R;

public class One_List_Activity extends AppCompatActivity {

    ImageView btn_Bedroom_1;
    ImageView btn_Bedroom_10;
    ImageView btn_Bedroom_2;
    ImageView btn_Bedroom_3;
    ImageView btn_Bedroom_4;
    ImageView btn_Bedroom_5;
    ImageView btn_Bedroom_6;
    ImageView btn_Bedroom_7;
    ImageView btn_Bedroom_8;
    ImageView btn_Bedroom_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedroom_list);

        btn_Bedroom_1 =  (ImageView) findViewById(R.id.btn_Bedroom_1);
        btn_Bedroom_2 =  (ImageView) findViewById(R.id.btn_Bedroom_2);
        btn_Bedroom_3 =  (ImageView) findViewById(R.id.btn_Bedroom_3);
        btn_Bedroom_4 =  (ImageView) findViewById(R.id.btn_Bedroom_4);
        btn_Bedroom_5 =  (ImageView) findViewById(R.id.btn_Bedroom_5);
        btn_Bedroom_6 =  (ImageView) findViewById(R.id.btn_Bedroom_6);
        btn_Bedroom_7 =  (ImageView) findViewById(R.id.btn_Bedroom_7);
        btn_Bedroom_8 =  (ImageView) findViewById(R.id.btn_Bedroom_8);
        btn_Bedroom_9 =  (ImageView) findViewById(R.id.btn_Bedroom_9);
        btn_Bedroom_10 = (ImageView) findViewById(R.id.btn_Bedroom_10);

        btn_Bedroom_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);

            }
        });
        btn_Bedroom_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_3.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_4.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_5.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_6.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_7.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_8.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_9.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
        btn_Bedroom_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(One_List_Activity.this, One_10.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                One_List_Activity.this.startActivity(intent);
            }
        });
    }
}