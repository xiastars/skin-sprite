package cn.geminiwen.skinsprite.demo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

import cn.geminiwen.skinsprite.app.SkinnableActivity;
import cn.geminiwen.skinsprite.view.SkinnableTextView;

public class MainActivity extends SkinnableActivity implements View.OnClickListener{

    SkinnableTextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_change).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int currentNightMode = getResources().getConfiguration().uiMode
                & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode) {
            case Configuration.UI_MODE_NIGHT_NO: {
                setDayNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                // Night mode is not active, we're in day time
                break;
            }
            case Configuration.UI_MODE_NIGHT_YES:{
                setDayNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                // Night mode is active, we're at night!
                break;
            }
            case Configuration.UI_MODE_NIGHT_UNDEFINED: {
                // We don't know what mode we're in, assume notnight
            }
        }


    }
}
