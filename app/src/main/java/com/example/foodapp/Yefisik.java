package com.example.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Yefisik extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yefisik);

    }
    public static int [] detailedYefisikImages={R.raw.kitfo,R.raw.sheklatibs,R.raw.dulet};
    public static int []detailedYefisikTitle={R.string.kitfo_title,R.string.sheklatibs_title,R.string.dulet_title};
    public static int []detailedyefisikDescription={R.string.kitfo_description,R.string.shekl_tibs_description,R.string.dulet_description};
    public void openYefisikDetailed(View view) {
        Intent yefisikDetailedIntent=new Intent(this,yefisikDetailed.class);
        switch (view.getId()) {
            case R.id.kitfoid:
                yefisikDetailedIntent.putExtra(yefisikDetailed.selectedFood,0);
                break;
            case R.id.shekla_tibsid:
                yefisikDetailedIntent.putExtra(yefisikDetailed.selectedFood,1);
                break;
            case R.id.duletid:
                yefisikDetailedIntent.putExtra(yefisikDetailed.selectedFood,2);
                break;

        }
        startActivity(yefisikDetailedIntent);
    }
}
