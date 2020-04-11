package com.mycompany.daa;

public class Contract extends Staff 
{
    int period;
    public Contract(int id, int no, int sal, String na, int pd)
    {
        super(id, no, sal, na);
        period = pd;
    }
    void Cdisplay()
    {
        System.out.println("---------------------------------------");
        System.out.println("Contract Staff Details");
        super.display();
        System.out.println("Contract Period : " + period + " years");
    }
}