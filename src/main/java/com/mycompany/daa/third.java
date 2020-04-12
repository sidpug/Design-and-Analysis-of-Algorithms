package com.mycompany.daa;

public class third implements Runnable
{
    public int x;
    public third(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("Third Thread:Cube of the number is "+ x*x*x +"\n");
    }
}