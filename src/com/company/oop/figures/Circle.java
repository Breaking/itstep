package com.company.oop.figures;

/**
 * Created by Mike on 24.03.2016.
 */
public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle - " + "radius = " + radius + " length = " + calculateLength()
                + " square = " + calculateSquare();
    }
}
