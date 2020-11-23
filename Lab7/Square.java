package com.company;

public class Square extends Figure {
    public double Length;

    public Square(double length) {
        Length = length;
    }


    @Override
    public double GetArea() {
        return Length * Length;
    }

    @Override
    public double GetPerimeter() {
        return Length * 4;
    }
}
