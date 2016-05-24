package com.loften.vieweventsample.mysample.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by loften on 16/5/24.
 */
public class TestButton extends Button {

    public TestButton(Context context) {
        this(context, null);
    }

    public TestButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("button","onTouchEvent-- action="+ event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("button","dispatchTouchEvent-- action="+ event.getAction());
        return super.dispatchTouchEvent(event);
    }
}
