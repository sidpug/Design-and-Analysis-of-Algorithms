package com.mycompany.daa;

public class Multilevel 
{
    public static void main(String[] args) 
    {
        Teaching t1 = new Teaching(11,998764534,31000,"Anil","CSE",10);
        Teaching t2 = new Teaching(12,996655546,30000,"Anu","ISE",9);
        Teaching t3 = new Teaching(13,999933442,32000,"Anusha","EEE",8);
        t1.Tdisplay();
        t2.Tdisplay();
        t3.Tdisplay();
        Technical te1 = new Technical(21,998776655,22000,"Kumar","C");
        Technical te2 = new Technical(22,998336655,28000,"Krishna","Java");
        Technical te3 = new Technical(23,988446655,33000,"Kiran","Java");
        te1.Tedisplay();
        te2.Tedisplay();
        te3.Tedisplay();

    }
}