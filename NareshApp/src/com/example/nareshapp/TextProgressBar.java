package com.example.nareshapp;




import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/**
 * @author Santosh Koalnapaka
 */


public class TextProgressBar extends ProgressBar {



//private String text = "";

private int textColor = Color.BLACK;

private float textSize = 17;



public TextProgressBar(Context context) {

    super(context);

}



public TextProgressBar(Context context, AttributeSet attrs) {

    super(context, attrs);

    setAttrs(attrs);

}



public TextProgressBar(Context context, AttributeSet attrs, int defStyle) {

    super(context, attrs, defStyle);

    setAttrs(attrs);

}
private void setAttrs(AttributeSet attrs) {

    if (attrs != null) {

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.TextProgressBar, 0, 0);

//        setText(a.getString(R.styleable.TextProgressBar_text));

        setTextColor(a.getColor(R.styleable.TextProgressBar_textColor, Color.BLACK));

        setTextSize(a.getDimension(R.styleable.TextProgressBar_textSize, 17));

        a.recycle();

    }

}



@Override

protected synchronized void onDraw(Canvas canvas) {

    super.onDraw(canvas);

    Paint textPaint = new Paint();

    textPaint.setAntiAlias(true);

    textPaint.setColor(textColor);

    textPaint.setTextSize(textSize);

    Rect bounds = new Rect();

//    textPaint.getTextBounds(text, 0, text.length(), bounds);

    @SuppressWarnings("unused")
	int x = getWidth() / 2 - bounds.centerX();

    @SuppressWarnings("unused")
	int y = getHeight() / 2 - bounds.centerY();

//    canvas.drawText(text, x, y, textPaint);

}



//public String getText() {
//
////    return text;
//
//}



public synchronized void setText(String text) {

    if (text != null) {

//        this.text = text;

    } else {

//        this.text = "";

    }

    postInvalidate();

}



public int getTextColor() {

    return textColor;

}
public synchronized void setTextColor(int textColor) {

    this.textColor = textColor;

    postInvalidate();
}
public float getTextSize() {

    return textSize;

}
public synchronized void setTextSize(float textSize) {
	this.textSize = textSize;

    postInvalidate();

}
}
