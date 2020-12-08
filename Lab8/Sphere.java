package com.company;

public class Sphere implements GeometricBody {
    public double Radius;

    Sphere(double radius) {
        Radius = radius;
    }

    @Override
    public double GetSurface() {
        return 4 * Math.PI * Radius * Radius;
    }

    @Override
    public double GetVolume() {
        return 4 / 3 * Math.PI * Math.pow(Radius, 3);
    }

}
