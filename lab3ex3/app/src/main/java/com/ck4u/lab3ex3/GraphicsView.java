package com.ck4u.lab3ex3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View{

    Bitmap[] frames = new Bitmap [16]; //16 frames
    int i=0;

    public GraphicsView(Context context) {
        super(context);

        frames [0] = BitmapFactory.decodeResource (getResources () ,R.drawable.img1);
        frames [1] = BitmapFactory.decodeResource (getResources () , R.drawable.img2);
        frames [2] = BitmapFactory.decodeResource (getResources () , R.drawable.img3);
        frames [3] = BitmapFactory. decodeResource (getResources () , R.drawable.img4);

    }




    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 16){
            canvas.drawBitmap(frames[i], 40, 40, new Paint());
        }
        else {
            i =0;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}
