package com.xy.xiaoyang.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xy.xiaoyang.R;
import com.xy.xiaoyang.R;

import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    @OnClick(R.id.im_back)
    void back(){
        startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        finish();
    }
}
