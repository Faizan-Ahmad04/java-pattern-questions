package com.Apnikaksha.Pattern;

import java.util.Scanner;

public class NumberPyramid2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();

        // Outer for loop for row
        for (int i = 1; i <= row; i++) {
            // Inner for loop for space
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // Innner for loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        sc.close();
    }

}
