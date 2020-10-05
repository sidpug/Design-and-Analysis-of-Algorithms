package com.mycompany.daa;

import java.util.Scanner;

public class theString {
    String str;
    int cap, sm;

    theString() {
        str = null;
        cap = 0;
        sm = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        sc.close();
    }

    void Recursive_fn(int n) {
        if (n > -1) {
            if (Character.isUpperCase(str.charAt(n)) == true){
                cap++;
                Recursive_fn(--n);
            } 
            else
            {
                sm++;
                Recursive_fn(--n);
            }
        } else
            return;
    }

    void display() {
        Recursive_fn(str.length()-1);
        System.out.println("The String is " + str);
        System.out.println("Capital Letters: " + cap);
        System.out.println("Small Case letters: " + sm);
    }

    public static void main(String[] args) {
        theString s = new theString();
        s.accept();
        s.display();
    }
}