package com.mycompany.daa;

public class Technical extends Staff
{
    String skills;
    public Technical(int id, int no, int sal, String na, String sk)
    {
        super(id, no, sal, na);
        skills = sk;
    }
    void Tedisplay()
    {
        System.out.println("---------------------------------------");
        System.out.println("Technical Staff Details");
        super.display();
        System.out.println("Skills : "+skills);
    }
}