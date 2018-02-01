package com.example.drjaatpc.customdrawing;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Drjaatpc on 01-02-2018.
 */

public class ViewClass extends SurfaceView {
    Context ct;
    Canvas c;
    SurfaceHolder sh;
    public ViewClass(Context context){
        super(context);
        ct = context;
        sh = getHolder();
        sh.addCallback(new SurfaceHolder.Callback() {

            @Override
            @SuppressLint("Wrong call")
            public void surfaceCreated(SurfaceHolder holder) {
                c =sh.lockCanvas();
                draw(c);
                sh.unlockCanvasAndPost(c);
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });
    }
    @Override
    protected  void onDraw(Canvas canvas){
        Paint p = new Paint();
        p.setColor(Color.RED);
        p.setTextSize(100f);
        canvas.drawText("Hello",100,100,p);
        p.setColor(Color.YELLOW);
        canvas.drawCircle(450,500,100,p);
        p.setColor(Color.CYAN);
        float []f = {0,0,200,0,200,0,100,100,100,100,0,0};
        canvas.drawLines(f,p);
        RectF r =  new RectF(0,100,200,200);
        canvas.drawOval(r,p);
        Rect rr = new Rect(0,0,100,100);
        canvas.drawRect(rr,p);
    }
}
