package com.Apnikaksha.Pattern;

import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();

        // Outer for loop
        for (int i = row; i >= 1; i--) {
            // Inner for loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
