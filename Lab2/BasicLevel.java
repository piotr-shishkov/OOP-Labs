package com.company;

public class BasicLevel {
    public static void main(String[] args) {
        Box[] MyBoxes = new Box[3];

        MyBoxes[0]= new Box();
        MyBoxes[1]= new Box(5);
        MyBoxes[2]= new Box(2,2,4);

        System.out.println("Boxes list:");
        for(var box:MyBoxes){
            System.out.println("\nBox HxWxD = "+box.Height+"x"+box.Width+"x"+box.Depth);
            //Advanced Level Part
            System.out.println("Surface Area = "+box.SurfaceArea()+" units^2; Volume = "+box.Volume()+" units^3");
        }
    }
}

class Box {
    public int Height;
    public int Width;
    public int Depth;

    public Box(){
        Height = 1;
        Width = 1;
        Depth =1;
    }

    public Box(int size){
        Height = size;
        Width = size;
        Depth =size;
    }

    public Box(int h, int w, int d){
        Height = h;
        Width = w;
        Depth = d;
    }

    public int  SurfaceArea(){
        return (2*Depth*Width) + (2*Depth*Height) + (2*Width*Height);
    }

    public int  Volume(){
        return Depth * Width * Height;
    }
}
