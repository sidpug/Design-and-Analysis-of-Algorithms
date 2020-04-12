package com.mycompany.daa;

public class second implements Runnable
{
    public int x;
    public second(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("Second thread:Square of the number is " + x*x);
    }
}