package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape {
    protected int x, y; // Assuming shapes will have coordinates

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        String color = "blue";
    }

    public abstract double area();
    public abstract void draw(Canvas canvas, Paint paint);
}
