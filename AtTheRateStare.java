package com.Apnikaksha.Pattern;

import java.util.Scanner;

public class AtTheRateStare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n");
        int n = sc.nextInt();
        int temp = n;
        int nm1 = n - 1;

        // for upper pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 && i != n + 1) {
                    System.out.print("@");
                }
            }
            System.out.println();
        }

        // for upper pattern's last line
        for (int i = 1; i <= n + 1; i++) {
            if (i == 1) {
                System.out.print("@");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();

        // for middle lines (without @)
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= temp; j++) {
                System.out.print(" ");
            }

            temp = temp + nm1;

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for lower pattern
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j < temp + 1; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                for (int j = 1; j <= n + 1; j++) {
                    if (j == n + 1) {
                        System.out.print("@");
                    } else {
                        System.out.print("*");
                    }
                }

                System.out.println();
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" ");
                }
                System.out.println("@");
            }
        }
        sc.close();
    }
}
