package com.mycompany.daa;

public class Staff 
{
    int staffid,phone,salary;
    String name;
    public Staff(int id, int no, int sal, String na)
    {
        staffid = id;
        phone = no;
        salary = sal;
        name = na;
    }
    void display()
    {
        System.out.println("--------------------------------------");
        System.out.println("Staff ID: "+ staffid);
        System.out.println("Staff Phone Number: "+ phone);
        System.out.println("Staff Salary: "+salary);
        System.out.println("Staff Name: "+name);
    }
}


