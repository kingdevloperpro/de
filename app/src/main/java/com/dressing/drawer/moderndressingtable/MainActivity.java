package com.dressing.drawer.moderndressingtable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.dressing.drawer.moderndressingtable.one.One_List_Activity;
import com.dressing.drawer.moderndressingtable.Four.Four_Design;
import com.dressing.drawer.moderndressingtable.Three.Three_DesignActivity;
import com.dressing.drawer.moderndressingtable.two.Two_Activity;

public class MainActivity extends AppCompatActivity {

    ImageView btn_3DHome_design;
    ImageView btn_DressingDesign_Design;
    ImageView btn_Exterior_Design;
    ImageView btn_kitchenDesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_kitchenDesign = (ImageView) findViewById(R.id.btn_kitchenDesign);
        btn_3DHome_design = (ImageView) findViewById(R.id.btn_3DHome_design);
        btn_DressingDesign_Design = (ImageView) findViewById(R.id.btn_DressingDesign_Design);
        btn_Exterior_Design = (ImageView) findViewById(R.id.btn_Exterior_Design);

        this.btn_kitchenDesign = (ImageView) findViewById(R.id.btn_kitchenDesign);
        this.btn_3DHome_design = (ImageView) findViewById(R.id.btn_3DHome_design);
        this.btn_DressingDesign_Design = (ImageView) findViewById(R.id.btn_DressingDesign_Design);
        this.btn_Exterior_Design = (ImageView) findViewById(R.id.btn_Exterior_Design);

        this.btn_kitchenDesign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, One_List_Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainActivity.this.startActivity(intent);
            }
        });
        this.btn_3DHome_design.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Two_Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainActivity.this.startActivity(intent);
            }
        });
        this.btn_DressingDesign_Design.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Four_Design.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainActivity.this.startActivity(intent);
            }
        });
        this.btn_Exterior_Design.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Three_DesignActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}