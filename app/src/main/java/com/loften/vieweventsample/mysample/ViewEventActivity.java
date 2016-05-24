package com.loften.vieweventsample.mysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.loften.vieweventsample.R;
import com.loften.vieweventsample.mysample.widget.TestButton;
import com.loften.vieweventsample.mysample.widget.TestLayout;

public class ViewEventActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{

    TestButton btn;
    TestLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_event);

        btn = (TestButton) findViewById(R.id.btn);
        layout = (TestLayout) findViewById(R.id.layout);

        layout.setOnClickListener(this);
        layout.setOnTouchListener(this);
        btn.setOnClickListener(this);
        btn.setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.e("activity","view:" + v);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.e("activity","view:" + v + " -- event:" + event.getAction());
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("activity","onTouchEvent -- event:" + event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public void onUserInteraction() {
        Log.e("activity","onUserInteraction --");
        super.onUserInteraction();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("activity","dispatchTouchEvent -- event:" + event.getAction());
        return super.dispatchTouchEvent(event);
    }
}
