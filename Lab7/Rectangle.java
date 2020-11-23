package com.company;

public class Rectangle extends Figure {
    public double Width;
    public double Length;

    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }


    @Override
    public double GetArea() {
        return Width * Length;
    }

    @Override
    public double GetPerimeter() {
        return Width * 2 + Length * 2;
    }
}