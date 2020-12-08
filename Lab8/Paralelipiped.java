package com.company;

public class Paralelipiped implements GeometricBody {
    public double Width;
    public double Height;
    public double Length;

    Paralelipiped(double width, double height, double length) {
        Width = width;
        Height = height;
        Length = length;
    }

    @Override
    public double GetSurface() {
        return 2 * Height * (Width + 2 * Length);
    }

    @Override
    public double GetVolume() {
        return Height * Width * Length;
    }

}
