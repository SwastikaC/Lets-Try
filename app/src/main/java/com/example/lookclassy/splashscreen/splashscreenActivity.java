package com.example.lookclassy.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lookclassy.R;
import com.example.lookclassy.home.MainActivity;


public class SplashScreenActivity extends AppCompatActivity {
        boolean isLogged = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isLogged = SharedPrefUtils.getBool(SplashScreenActivity.this, getString(R.string.isLogged), false);
                System.out.println(isLogged);
                if (isLogged)
                    startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                else
                    startActivity(new Intent(SplashScreenActivity.this, login.class));
                finish();
            }
        }, 400);

    }
}
