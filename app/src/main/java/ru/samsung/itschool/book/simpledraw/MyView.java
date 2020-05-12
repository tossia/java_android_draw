package ru.samsung.itschool.book.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    int N = 4; // количество шариков
    float[] x  = new float[N];
    float[] y  = new float[N];
    float[] vx = new float[N];
    float[] vy = new float[N];

    public MyView(Context context) {


        super(context);
    for (int i = 0; i < N; i++){
        x[i] = (float)(Math.random() * getWidth());
        y[i] = (float)(Math.random() * getHeight());
        vx[i] = (float)(Math.random() * 6 - 3);
        vy[i] = (float)(Math.random() * 6 - 3);
    }
}
    //float x = 0;
  //  long lastTime = System.currentTimeMillis();
    @Override
    protected void onDraw(Canvas canvas) {
Paint paint = new Paint();
/*        int y = 0;
        paint.setStrokeWidth(10);
        paint.setColor(Color.GREEN);
        while (y < canvas.getHeight()) {
            canvas.drawLine(0, y,
                    this.getWidth(), y, paint);
            y += 80;
        }
        int x = 0;
        paint.setColor(Color.MAGENTA);
        while (x < canvas.getWidth()) {
            canvas.drawLine(0, y,
                    this.getHeight(), x, paint);
            x += 500;
        }
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(300, 300, 200, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(300, 300, 200, paint);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(300, 600, 900, 1200, paint);
*/
   //     canvas.drawCircle(x, 500, 20, paint);
        // готовим x c учетом прошедшего времени
        // c момента последней перерисовки
     //   long nowTime = System.currentTimeMillis();
  //      x += 0.1f * (nowTime - lastTime);
        // сохраняем время последней перерисовки
     //   lastTime = nowTime;
        // отрисовываем все шарики
        for (int i = 0; i < N; i++) {
            canvas.drawCircle(x[i], y[i], 20, paint);
        }
        // готовим массивы x и у для следущего кадра
        for (int i = 0; i < N; i++) {
            x[i] += vx[i];
            y[i] += vy[i];
        }
        //запрашиваем перерисовку
        invalidate();
    }
}
