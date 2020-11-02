package com.company;

public class H extends G
{
    protected String h = "iam_h";
    private X x = new X("xhx");

    public H(String h, X x)
    {
        super("ggg", x);
        this.h = h;
    }

    public String toString() {
        return super.toString() + ", h = " + h;
    }
}
