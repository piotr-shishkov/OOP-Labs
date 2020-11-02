package com.company;

public class J extends I
{
    protected String j = "iam_j";

    public J(String j, X x)
    {
        super("iii", x);
        this.j = j;
    }


    public String toString() {
        return super.toString() + ", j = " + j;
    }
}
