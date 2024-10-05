package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);  // Correctly call the constructor of the superclass
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of the circle
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        // Draws the circle on the provided canvas using the specified paint
        canvas.drawCircle((float) this.x, (float) this.y, (float) this.radius, paint);
    }
}
