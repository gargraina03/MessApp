package com.example.android.messapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img,img1;
    private View.OnClickListener newActivityListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,bottom_nav.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimationUtils anim;
        img = (ImageView)findViewById(R.id.imageView);
        img.setOnClickListener(newActivityListener);
        img1 = (ImageView)findViewById(R.id.title);



    }

    @Override
    public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus)
            img1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_in));
    }
}
