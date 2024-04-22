package com.example.labtest2;

public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}

