package com.example.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;

public class Yetsom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yetsom);
    }
    public static int [] yetsomFoodImages={R.raw.shirom,R.raw.gomen,R.raw.kik};
    public static int [] yestomFoodTitles={R.string.shiro_title,R.string.gomen_title,R.string.kik_title};
    public static int [] yetsomFoodDescriptions={R.string.shiro_description,R.string.gomen_description,R.string.kik_wot_description};



    public void openYetsomDetailed(View view) {
        Intent yetsomDetailedIntent=new Intent(this,yestomDetailed.class);
        switch (view.getId()) {
            case R.id.shiroid:
                yetsomDetailedIntent.putExtra(yestomDetailed.selectedFood,0);
                break;
            case R.id.gomenid:
                yetsomDetailedIntent.putExtra(yestomDetailed.selectedFood,1);
                break;
            case R.id.kikid:
                yetsomDetailedIntent.putExtra(yestomDetailed.selectedFood,2);
                break;

        }

        startActivity(yetsomDetailedIntent);
    }
}
