package com.company;

public class F extends E
{
    protected String f = "iam_f";

    public F(String f, X x)
    {
        super("eee", x);
        this.f = f;
    }

    public String toString() {
        return super.toString() + ", f = " + f;
    }
}
