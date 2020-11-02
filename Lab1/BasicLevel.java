package com.company;

public class BasicLevel {

    public static void main(String[] args) {
        //Creating first monitor
        Monitor m1 = new Monitor();
        m1.MonitorDimension = new Dimension(2,9,16);
        m1.MonitorResolution = new Resolution(1920, 1080);
        m1.MonitorColor = new Color(125,255,0);

        //Creating second monitor
        Monitor m2 = new Monitor();
        m2.MonitorDimension= new Dimension(4,9,21);
        m2.MonitorResolution = new Resolution(2560, 1080);
        m2.MonitorColor = new Color(255,255,255);

        //Method which compares monitors
        CompareMonitors(m1, m2);
    }

    public static void CompareMonitors(Monitor m1, Monitor m2){
        if(m1.MonitorResolution.Height + m1.MonitorResolution.Width > m2.MonitorResolution.Height + m2.MonitorResolution.Width){
            System.out.println("First Monitor has Higher Resolution than second");
        }
        else System.out.println("Second Monitor has Higher Resolution than first");
    }
}

class Monitor {
    public Dimension MonitorDimension;
    public Resolution MonitorResolution;
    public Color MonitorColor;
}

class Dimension{
    public int Width;
    public int Height;
    public int Length;

    public Dimension(int w, int h, int l){
        Width = w;
        Height = h;
        Length = l;
    }
}

class Resolution{
    public int Width;
    public int Height;

    public Resolution(int w, int h){
        Width = w;
        Height =h;
    }
}

class Color{
    public int r;
    public int g;
    public int b;

    public Color(int r, int i, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
