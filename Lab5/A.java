package com.company;

public class A
{
    protected String a = "iam_a";
    protected X x = new X("xxx");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public String toString() {
        return "a = " + a + ", x.value = " + x.getVal();
    }
}
