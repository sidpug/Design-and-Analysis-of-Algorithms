package com.mycompany.daa;

public class Teaching extends Staff
{
    String domain;
    int no_of_publications;
    public Teaching(int id, int no, int sal, String na, String d, int nop)
    {
        super(id, no, sal, na);
        domain = d;
        no_of_publications=nop;
    }
    void Tdisplay()
    {
        System.out.println("-----------------------------------");
        System.out.println("Teaching Staff Details");
        super.display();
        System.out.println("Domain : "+domain);
        System.out.println("No_of_publications : "+no_of_publications);
    }
}
