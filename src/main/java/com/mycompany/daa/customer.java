package com.mycompany.daa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class customer 
{
    String name;
    String date;
    public void read()
    {
        Scanner in = new Scanner(System.in);
        name = in.next();
        date = in.next();
        
    }
    public void display()
    {
        System.out.print(name+',');
        String delims = "/";
        StringTokenizer s = new StringTokenizer(date,delims);
        while (s.hasMoreElements()) 
        {
            System.out.print(s.nextElement() +",");           
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the customer details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customer");
        int n = sc.nextInt();
        customer[] c = new customer[n];
        System.out.println("Enter the Customer Name and date");
        for(int i = 0;i<n;i++)
        {
            c[i] = new customer();
            c[i].read();
            
        }
        for(int i = 0;i<n;i++)
            c[i].display();
        sc.close();
    }
}