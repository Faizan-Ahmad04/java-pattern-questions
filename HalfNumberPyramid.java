package com.Apnikaksha.Pattern;

import java.util.*;

public class HalfNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();

        // Outer for loop
        for (int i = 1; i <= row; i++) {
            // Inner for lop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
