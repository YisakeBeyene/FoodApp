package com.example.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class yefisikDetailed extends AppCompatActivity {
    ImageView yefisikImage;
    TextView yefisikTitle,yefisikdescription;
    Animation topToBOttom,bottomToTop;
    public static final String selectedFood="what";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yefisik_detailed);
        yefisikImage=(ImageView)findViewById(R.id.yefisikImageId);
        yefisikTitle=(TextView)findViewById(R.id.yefisikTitleId);
        yefisikdescription=(TextView)findViewById(R.id.yefisikDescriptionId);
        topToBOttom= AnimationUtils.loadAnimation(this,R.anim.top_to_bottom);
        yefisikImage.setAnimation(topToBOttom);
        bottomToTop=AnimationUtils.loadAnimation(this,R.anim.bottom_to_top);
        yefisikdescription.setAnimation(bottomToTop);
        Intent intent=getIntent();
        int index= intent.getIntExtra(selectedFood,0);
        yefisikTitle.setText(Yefisik.detailedYefisikTitle[index]);
        yefisikImage.setImageResource(Yefisik.detailedYefisikImages[index]);

        yefisikdescription.setText(Yefisik.detailedyefisikDescription[index]);
    }
}
