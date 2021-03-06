package com.suda.jzapp.ui.activity.system;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.suda.jzapp.R;
import com.suda.jzapp.util.ThemeUtil;
import com.suda.jzapp.view.MyRoundColorView;

/**
 * Created by ghbha on 2016/2/14.
 */
public class EditThemeActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theme_layout);
        for (int i = 0; i < 9; i++) {
            ((MyRoundColorView) findViewById(getId("theme" + i))).setMyRoundColor(getResources().getColor(ThemeUtil.map.get(i).getMainColorID()));
        }
    }

    public int getId(String paramString) {
        return getResources().getIdentifier(paramString, "id", getPackageName());
    }


    public void switchTheme(View view) {
        String tag = view.getTag().toString();
        ThemeUtil.setThemeColor(this, Integer.parseInt(tag));
        setResult(RESULT_OK);
        this.finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        finish();
        return true;
    }
}
