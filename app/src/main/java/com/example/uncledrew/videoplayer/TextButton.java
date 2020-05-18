package com.example.uncledrew.videoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class TextButton extends Button {

    private static final String TAG = "OtherText";

    public TextButton(Context context) {
        super(context);
    }


    public TextButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "Button:onTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(TAG, "Button:dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }
}
