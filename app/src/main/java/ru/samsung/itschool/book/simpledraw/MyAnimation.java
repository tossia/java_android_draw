package ru.samsung.itschool.book.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyAnimation extends View {
    public MyAnimation(Context context) {
        super(context);
    }

    Paint paint = new Paint();
    float x = 0;
    long lastTime = System.currentTimeMillis();
    @Override
    protected void onDraw(Canvas canvas) {
        if (x < getWidth()) {
            paint.setColor(Color.RED);
            canvas.drawCircle(x, 300, 30, paint);
            // готовим x для следущего кадра
            x += 5f;

            paint.setColor(Color.GREEN);
            canvas.drawCircle(x, 600, 20, paint);
            // готовим x c учетом прошедшего времени
            // c момента последней перерисовки
            long nowTime = System.currentTimeMillis();
            x += 0.1f * (nowTime - lastTime);
            // сохраняем время последней перерисовки
            lastTime = nowTime;
            invalidate();
        }
    }
}
