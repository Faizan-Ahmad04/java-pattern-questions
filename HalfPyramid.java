package com.Apnikaksha.Pattern;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of row: ");
        int row = sc.nextInt();

        // Outer Loop
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Println() for new line
            System.out.println();
        }
        sc.close();
    }

}
