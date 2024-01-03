package com.dressing.drawer.moderndressingtable.Three;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.dressing.drawer.moderndressingtable.R;

public class Three_DesignActivity extends AppCompatActivity {

    ImageView btn_ExteriorDesign_1;
    ImageView btn_ExteriorDesign_2;
    ImageView btn_ExteriorDesign_3;
    ImageView btn_ExteriorDesign_4;
    ImageView btn_ExteriorDesign_5;
    ImageView btn_ExteriorDesign_6;
    ImageView btn_ExteriorDesign_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exterior_design);

        btn_ExteriorDesign_1 = (ImageView) findViewById(R.id.btn_ExteriorDesign_1);
        btn_ExteriorDesign_2 = (ImageView) findViewById(R.id.btn_ExteriorDesign_2);
        btn_ExteriorDesign_3 = (ImageView) findViewById(R.id.btn_ExteriorDesign_3);
        btn_ExteriorDesign_4 = (ImageView) findViewById(R.id.btn_ExteriorDesign_4);
        btn_ExteriorDesign_5 = (ImageView) findViewById(R.id.btn_ExteriorDesign_5);
        btn_ExteriorDesign_6 = (ImageView) findViewById(R.id.btn_ExteriorDesign_6);
        btn_ExteriorDesign_7 = (ImageView) findViewById(R.id.btn_ExteriorDesign_7);
        btn_ExteriorDesign_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Three_DesignActivity.this, Three_1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Three_DesignActivity.this.startActivity(intent);
            }
        });
        btn_ExteriorDesign_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Three_DesignActivity.this, Three_2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Three_DesignActivity.this.startActivity(intent);
            }
        });
        btn_ExteriorDesign_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Three_DesignActivity.this, Three_3.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Three_DesignActivity.this.startActivity(intent);
            }
        });
        btn_ExteriorDesign_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Three_DesignActivity.this, Three_4.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Three_DesignActivity.this.startActivity(intent);
            }
        });
        btn_ExteriorDesign_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Three_DesignActivity.this, Three_5.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Three_DesignActivity.this.startActivity(intent);
            }
        });
        btn_ExteriorDesign_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Three_DesignActivity.this, Three_6.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Three_DesignActivity.this.startActivity(intent);
            }
        });
        btn_ExteriorDesign_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Three_DesignActivity.this, Three_7.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                Three_DesignActivity.this.startActivity(intent);
            }
        });

    }
}