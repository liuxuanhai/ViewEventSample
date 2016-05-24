package com.loften.vieweventsample.mysample.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by loften on 16/5/24.
 */
public class TestLayout extends RelativeLayout{

    public TestLayout(Context context) {
        this(context, null);
    }

    public TestLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("testlayout","onTouchEvent-- action=" + event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.e("testlayout","onInterceptTouchEvent-- action=" + event.getAction());
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("testlayout","dispatchTouchEvent-- action=" + event.getAction());
        return super.dispatchTouchEvent(event);
    }
}
