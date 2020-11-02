package com.company;

public class G extends F
{
    protected String g = "iam_g";

    public G(String g, X x)
    {
        super("fff", x);
        this.g = g;
    }

    public String toString() {
        return super.toString() + ", g = " + g;
    }
}
