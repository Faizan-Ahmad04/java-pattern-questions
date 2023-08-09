package com.Apnikaksha.Pattern;

import java.util.*;

public class ButterflyPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= row; i++) {
            // First Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd Half (lowe part)
        for (int i = row; i >= 1; i--) {
            // First Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
