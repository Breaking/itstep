package com.company.oop.figures;

/**
 * Created by Mike on 24.03.2016.
 */
public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateLength() {
        return side * 4;
    }

    @Override
    public double calculateSquare() {
        return side * side;
    }

    public double calculateDiagonal(){
        return side * Math.sqrt(2);
    }

    @Override
    public String toString() {
        return "Square - " + "side = " + side + " length = " + calculateLength() +
                " square = " + calculateSquare();
    }
}
