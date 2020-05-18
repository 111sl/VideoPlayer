package com.example.uncledrew.videoplayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View {
    public float currentX = 40;
    public float currentY = 50;
    Paint p = new Paint();
    public DrawView(Context context, AttributeSet set){
        super(context,set);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                this.currentX = event.getX();
                this.currentY = event.getY();
                p.setColor(Color.BLUE);
                this.invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                this.currentX = event.getX();
                this.currentY = event.getY();
                this.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                p.setColor(Color.RED);
                break;

            default:
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        p.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,40,p);
    }
}
