package com.mycompany.daa;

import java.util.Scanner;

public class student {

    String USN, Name, branch;
    int phone;

    void insertRecord(final String reg, final String name, final String brnch, final int ph) {
        USN = reg;
        Name = name;
        branch = brnch;
        phone = ph;
    }

    void displayRecord() {
        System.out.println(USN + " " + Name + " " + branch + " " + phone);
    }

    public static void main(final String args[]) {
        final student s[] = new student[100];
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Students");
        final int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s[i] = new student();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter USN,Name,branch,phone");
            final String USN = sc.next();
            final String Name = sc.next();
            final String branch = sc.next();
            final int phone = sc.nextInt();
            s[i].insertRecord(USN, Name, branch, phone);
        }
        for (int i = 0; i < n; i++) {
            s[i].displayRecord();
        }
        sc.close();
    }
}
