package com.Apnikaksha.Pattern;

import java.util.*;

public class Half01Tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();

        // Outer for loop
        for (int i = 1; i < row; i++) {

            // Inner for lopp
            for (int j = 1; j <= i; j++) {

                if ((j + i) % 2 == 0) { // Even
                    System.out.print("1 ");
                } else { // Odd
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}