package com.company;

public class Cube implements GeometricBody {
    public double A;

    Cube(double a) {
        A = a;
    }

    @Override
    public double GetSurface() {
        return A * A * 6;
    }

    @Override
    public double GetVolume() {
        return Math.pow(A, 3);
    }

}
