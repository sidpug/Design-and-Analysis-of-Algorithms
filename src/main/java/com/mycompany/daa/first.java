package com.mycompany.daa;

import java.util.Random;

public class first extends Thread
{
    public  void run()
    {
        int num = 0;
        Random r = new Random();
        try {
            for(int i = 0;i<5;i++)
            {
                num = r.nextInt(100);
                System.out.println("First Thread Generated Number is "+ num);
                Thread t2 = new Thread(new second(num));
                t2.start();
                Thread t3 = new Thread(new third(num));
                t3.start();
                Thread.sleep(1000);
            }
        } catch (Exception e) {System.out.println(e.getMessage());
        }
    }
}