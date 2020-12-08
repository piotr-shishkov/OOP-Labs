package com.company;

import java.util.stream.Stream;

public class Lab8
{
    public static void main(String[] args) {
        GeometricBody[] bodies = new GeometricBody[]{
                new Cube(7),
                new Sphere(4.5),
                new Paralelipiped(6, 7, 8),
        };

        System.out.println("Max Volume Object is " + GetMaxVolume(bodies).getClass().getSimpleName());
        System.out.println("Max Surface Object is " + GetMaxSurface(bodies).getClass().getSimpleName());
    }

    static GeometricBody GetMaxVolume(GeometricBody[] objs) {
        return Stream.of(objs).max((obj1, obj2) -> obj1.GetVolume() - obj2.GetVolume() > 0 ? 1 : -1).get();
    }

    static GeometricBody GetMaxSurface(GeometricBody[] objs) {
        return Stream.of(objs).max((obj1, obj2) -> obj1.GetSurface() - obj2.GetSurface() > 0 ? 1 : -1).get();
    }
}


