package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class FigureController
{
    public static void main(String[] args)
    {
        ArrayList<Figure> figuresList = new ArrayList<Figure>();
        figuresList.add(new Rectangle(4,8));
        figuresList.add(new Square(5));
        figuresList.add(new Triangle(3, 6, 9));

        Figure BiggestFigure = GetFigureMaxArea(figuresList);
        System.out.println("Max area: " + BiggestFigure.GetArea());

        BiggestFigure = GetFigureMaxPerimeter(figuresList);
        System.out.println("Max perimeter: " + BiggestFigure.GetPerimeter());


        //Declaring Circle
        var circle = new Figure() {
            double Radius = 7;

            @Override
            public double GetArea() {
                return Math.PI * Radius * Radius;
            }

            @Override
            public double GetPerimeter() {
                return 2 * Math.PI * Radius;
            }
        };

        System.out.println("\nCirce area: " + circle.GetArea());
        System.out.println("\nCircle perimeter: " + circle.GetPerimeter());

        figuresList.add(circle);

        BiggestFigure = GetFigureMaxArea(figuresList);
        System.out.println("\nMax area: " + BiggestFigure.GetArea());

        BiggestFigure = GetFigureMaxPerimeter(figuresList);
        System.out.println("\nMax perimeter: " + BiggestFigure.GetPerimeter());
    }

    public static Figure GetFigureMaxArea(ArrayList<Figure> figures) {
        Figure[] figArray = figures.toArray(new Figure[0]);
        return Arrays.stream(figArray).max((f1, f2) -> f1.GetArea() - f2.GetArea() > 0 ? 1: -1).get();
    }

    public static Figure GetFigureMaxPerimeter(ArrayList<Figure> figures) {
        Figure[] figArray = figures.toArray(new Figure[0]);
        return Arrays.stream(figArray).max((f1, f2) -> f1.GetPerimeter() - f2.GetPerimeter() > 0 ? 1: -1).get();
    }
}


