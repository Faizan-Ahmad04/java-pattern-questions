
package com.Apnikaksha.Pattern;

import java.util.*;

public class Pyramid {
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
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();

    }
}
