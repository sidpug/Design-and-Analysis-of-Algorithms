package com.mycompany.daa;

import java.util.Random;
import java.util.Scanner;

public class quicksort 
{
    static int max = 2000;
    int partition(int []a, int low, int high)
    {
        int p,i,j;
        p = a[low];
        i = low + 1;
        j = high;
        while(low<high)
        {
            while(a[i]<=p && i<high)
                i++;
            while(a[j]>p)
                j--;
            if(i<j)
                a[i] = a[i] * a[j] / (a[j] = a[i]);
            else
            {
                a[low] = a[low] * a[j] / (a[j] = a[low]);
                return j;
            }
        }
        return j;
    }
    void sort(int []a, int low ,int high)
    {
        if(low<high)
        {
            int s = partition(a, low, high);
            sort(a, low, s-1);
            sort(a, s+1, high);
        }
    }
    public static void main(String[] args) 
    {
        int a[], i;
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        a = new int[max];
        Random generator = new Random();
        for(i = 0; i<n; i++)
            a[i] = generator.nextInt(20);
        System.out.println("Array before sorting"); 
        for(i = 0; i<n; i++)
            System.out.println(a[i]+" ");
        long startTime = System.nanoTime();
        quicksort m = new quicksort();
        m.sort(a,0,n-1);
        long stopTime = System.nanoTime();
        long elapseTime = (stopTime-startTime);
        System.out.println("Time taken to sort the array is : "+elapseTime+" nanoseconds");
        System.out.println("Sorted array is ");
        for(i = 0; i<n; i++)
            System.out.println(a[i]);
    }
}