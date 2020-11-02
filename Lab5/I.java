package com.company;

public class I extends H
{
    protected String i = "iam_i";

    public I(String i, X x)
    {
        super("hhh", x);
        this.i = i;
    }

    public String toString() {
        return super.toString() + ", i = " + i;
    }
}
