
package com.mycompany.daa;
import java.util.Scanner;

public class stack {
    final int max=100;
    int s[]=new int[max];
    int top=-1;
    void push(int ele)
    {
        if(top>=max-1)
            System.out.println("Stack overflow");
        else
            s[++top]=ele;
    }
    int pop()
    {
        int z=0;
        if(top==-1)
            System.out.println("Stack underflow");
        else
            z=s[top--];
        return z;
    }
    void display()
    {
        if(top==-1)
            System.out.println("Stack Empty");
        else
        {
            for(int i=top;i>-1;i--)
                System.out.println(s[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int q=1;
        stack m= new stack();
        System.out.println("Program To perform Stack Operations");
        Scanner sc = new Scanner(System.in);
        while(q!=0)
        {
            System.out.println("Enter \n 0.Exit \n 1.push \n 2.pop \n 3.display");
            System.out.println("Enter Your Choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                System.out.println("Enter The Element To be Pushed");
                int ele = sc.nextInt();
                m.push(ele);
                    break;
                case 2:
                int popele=m.pop();
                System.out.println("The Poped Element is "+popele);
                    break;
                case 3:
                System.out.println("The Elements in the Stack Are:");
                m.display();
                break;
                case 0:System.exit(1);
                    break;
            }
        }
        sc.close(); 
    }
}
