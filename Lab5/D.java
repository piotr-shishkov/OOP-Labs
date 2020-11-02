package com.company;

public class D extends C
{
    protected String d = "iam_d";
    protected X x = new X("xdx");

    public D(String d, X x)
    {
        super("ccc", x);
        this.d = d;
    }

    public String toString() {
        return super.toString() + ", d = " + d;
    }
}
