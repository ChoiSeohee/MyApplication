package com.example.seohee.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;

    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.heart);
        btn2 = (Button)findViewById(R.id.wingman);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationView = (LottieAnimationView) findViewById(R.id.animation_view);
                animationView.setAnimation("heart.json");
                animationView.loop(true);
                animationView.playAnimation();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationView = (LottieAnimationView) findViewById(R.id.animation_view);
                animationView.setAnimation("wingman.json");
                animationView.loop(true);
                animationView.playAnimation();
            }
        });
    }
}