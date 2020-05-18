package com.mycompany.daa;

import java.util.Scanner;

public class knapsackDP {
    public void solve(int wt[], int val[], int W, int N) {
        int i, j;
        int sol[][] = new int[N + 1][W + 1];
        for (i = 0; i <= N; i++) {
            for (j = 0; j <= W; j++) {
                if (i == 0 || j == 0)
                    sol[i][j] = 0;
                else if (wt[i] > j)
                    sol[i][j] = sol[i - 1][j];
                else
                    sol[i][j] = Math.max((sol[i - 1][j]), (sol[i - 1][j - wt[i]] + val[i]));
            }
        }
        System.out.println("The OPtimal Solution is " + sol[N][W]);
        int selected[] = new int[N + 1];
        for (i = 0; i < N; i++)
            selected[i] = 0;
        i = N;
        j = W;
        while (i > 0 && j > 0) {
            if (sol[i][j] != sol[i - 1][j]) {
                selected[i] = 1;
                j = j - wt[i];
            }
            i--;
        }
        System.out.println("\n Items Selected : ");
        for (i = 0; i < N; i++)
            if (selected[i] == 1)
                System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        knapsackDP ks = new knapsackDP();
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int wt[] = new int[n + 1];
        int val[] = new int[n + 1];
        System.out.println("\n Enter the weight for " + n + " elements");
        for (int i = 1; i <= n; i++)
            wt[i] = sc.nextInt();
        System.out.println("\n Enter the values for " + n + " elements");
        for (int i = 1; i <= n; i++)
            val[i] = sc.nextInt();
        System.out.println("\nEnter knapsack weight");
        int W = sc.nextInt();
        sc.close();
        ks.solve(wt, val, W, n);
    }
}