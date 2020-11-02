package com.company;

public class C extends B
{
    protected String c = "iam_c";


    public C(String c, X x)
    {
        super("bbb", x);
        this.c = c;
    }

    public String toString() {
        return super.toString() + ", c = " + c;
    }
}
