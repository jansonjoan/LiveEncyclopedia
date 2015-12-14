package com.janson.imdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;

import com.janson.imdemo.MainActivity;
import com.janson.imdemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by janson on 15-12-11.
 */
public class SplashActivity extends Activity {
    //加载次数
    int launchCount = 0;

    private static final String SHAREDPREFERENCES_NAME = "launchCount";
    @Bind(R.id.iv_splash)
    ImageView ivSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ButterKnife.bind(this);
        SharedPreferences share = getSharedPreferences(SHAREDPREFERENCES_NAME, MODE_PRIVATE);
        launchCount = share.getInt(SHAREDPREFERENCES_NAME, 0);
        Log.d(SHAREDPREFERENCES_NAME, "" + launchCount);
        if (launchCount == 0) {
            mHandler.sendEmptyMessageDelayed(SWITCH_MAINACTIVITY, 2000);
        } else {
            mHandler.sendEmptyMessageDelayed(SWITCH_GUIDACTIVITY, 2000);
        }

    }


    // *************************************************
    // Handler:跳转至不同页面
    // *************************************************
    private final static int SWITCH_MAINACTIVITY = 1000;
    private final static int SWITCH_GUIDACTIVITY = 1001;
    public Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SWITCH_MAINACTIVITY:
                    Intent mIntent = new Intent();
                    mIntent.setClass(SplashActivity.this,
                            MainActivity.class);
                    SplashActivity.this.startActivity(mIntent);
                    SplashActivity.this.finish();
                    break;
                case SWITCH_GUIDACTIVITY:
                    mIntent = new Intent(); // 第一次加载
                    mIntent.setClass(SplashActivity.this, GuideActivity.class);
                    SplashActivity.this.startActivity(mIntent);
                    SplashActivity.this.finish();
                    break;
            }
            super.handleMessage(msg);
        }
    };
}
