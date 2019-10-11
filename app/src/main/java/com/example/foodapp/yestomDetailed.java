package com.example.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class yestomDetailed extends AppCompatActivity {
    private ImageView detailedImage;
    private TextView detailedTitle, detailedDescription;
    Animation topToBOttom,bottomToTop;
    public static final String selectedFood="what";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yestom_detailed);
        detailedImage=(ImageView)findViewById(R.id.yestomImageId);
        detailedTitle=(TextView)findViewById(R.id.yetsomTitleId);
        detailedDescription=(TextView)findViewById(R.id.yetsomDescriptionId);
        topToBOttom= AnimationUtils.loadAnimation(this,R.anim.top_to_bottom);
        detailedImage.setAnimation(topToBOttom);
        bottomToTop=AnimationUtils.loadAnimation(this,R.anim.bottom_to_top);
        detailedDescription.setAnimation(bottomToTop);
        Intent intent=getIntent();
        int index=intent.getIntExtra(selectedFood,0);
        detailedImage.setImageResource(Yetsom.yetsomFoodImages[index]);
        detailedTitle.setText(Yetsom.yestomFoodTitles[index]);
        detailedDescription.setText(Yetsom.yetsomFoodDescriptions[index]);




    }
}
