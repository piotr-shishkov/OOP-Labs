package com.company;

public class Triangle extends Figure {
    public double SideA;
    public double SideB;
    public double SideC;

    public Triangle(double sidea, double sideb, double sidec) {
        SideA = sidea;
        SideB = sideb;
        SideC = sidec;
    }

    @Override
    public double GetArea() {
        double p = GetPerimeter()/2;
        return Math.sqrt(p * (p - SideA) * (p - SideB) * (p - SideC));
    }

    @Override
    public double GetPerimeter() {
        return SideA + SideB + SideC;
    }
}