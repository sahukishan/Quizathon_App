package com.example.quiz_app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw_Cross_Line_Class extends View {

	public Draw_Cross_Line_Class(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = new Paint();
		paint.setColor(Color.BLACK);
		Paint paint2 = new Paint();
		paint2.setColor(Color.WHITE);
		Rect rect = new Rect(0, 0, canvas.getHeight(), canvas.getHeight());
		canvas.drawRect(rect, paint2);
		canvas.drawLine(0, 0, canvas.getWidth(), canvas.getHeight(), paint);
		canvas.drawLine(canvas.getWidth(), 0, 0, canvas.getHeight(), paint);
	}

}
