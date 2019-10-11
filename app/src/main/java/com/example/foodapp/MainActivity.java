package com.example.foodapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
CardView yetsomButton, yefisikButton;
Animation leftToRight, rightToLeft;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yetsomButton=(CardView)findViewById(R.id.yetsom);
        yefisikButton=(CardView)findViewById(R.id.yefisik);
        leftToRight= AnimationUtils.loadAnimation(this,R.anim.left_to_right);
        yetsomButton.setAnimation(leftToRight);
        rightToLeft=AnimationUtils.loadAnimation(this,R.anim.right_to_left);
        yefisikButton.setAnimation(rightToLeft);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }



    public void openYetsom(View view) {
        Intent yetsomIntent=new Intent(this,Yetsom.class);

        startActivity(yetsomIntent);
    }

    public void openYefisik(View view) {
        Intent yefisikIntent=new Intent(this,Yefisik.class);
        startActivity(yefisikIntent);
    }


    public void opencheck(View view) {
        Intent in=new Intent(MainActivity.this,finalp.class);
        startActivity(in);
    }
    public void onClicShowAlert(View view){
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("are you sure?");
        alertDialog.setMessage("open that path?");
      alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialogInterface, int i) {
              Intent in=new Intent(MainActivity.this,finalp2.class);
              startActivity(in);

          }
      });
     alertDialog.setNegativeButton("no", new DialogInterface.OnClickListener() {
         @Override
         public void onClick(DialogInterface dialogInterface, int i) {

         }
     });
      alertDialog.show();
    }
}
