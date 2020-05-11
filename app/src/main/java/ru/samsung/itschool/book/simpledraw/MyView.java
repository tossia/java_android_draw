package ru.samsung.itschool.book.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import task.Task;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setStrokeWidth(10);
        int y = 0;
        int key = 0;
        while (y < canvas.getHeight()) {
            if (key == 0) {
                paint.setColor(Color.RED);
            } else {
                paint.setColor(Color.GREEN);
            }
            canvas.drawLine(0, y, this.getWidth(), y, paint);
            y +=60;
            if (key == 0 ) {
                key = 1;
            } else {
                key = 0;
            }
        }

    }
}
