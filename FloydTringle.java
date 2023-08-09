package com.Apnikaksha.Pattern;

import java.util.*;

public class FloydTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();

        int num = 1;

        // Outer for loop
        for (int i = 1; i <= row; i++) {

            // Inner for loop
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
        sc.close();
    }
}
