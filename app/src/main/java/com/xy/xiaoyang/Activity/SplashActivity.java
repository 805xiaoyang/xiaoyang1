package com.xy.xiaoyang.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xy.xiaoyang.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {
    @BindView(R.id.iv_loading)
    ImageView loadingView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        ButterKnife.bind(this);

        Animation animation = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.splash_loading);
        loadingView.startAnimation(animation);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(SplashActivity.this, AdActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
