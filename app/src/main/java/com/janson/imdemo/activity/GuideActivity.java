package com.janson.imdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.janson.imdemo.MainActivity;
import com.janson.imdemo.R;

/**
 * Created by janson on 15-12-11.
 */
public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000);
    }
}
