package com.mycompany.daa;

import java.util.Scanner;

public class division 
{
    public static void main(String[] args) 
    {
        int a,b,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two integers");
        a = sc.nextInt();
        b = sc.nextInt();
        try 
        {
           result = a/b;
           System.out.println("Result is "+ result);
        } catch (ArithmeticException e) {
            System.out.println("exception Caught : Divide by zero error "+e);}
    sc.close();
    }
}