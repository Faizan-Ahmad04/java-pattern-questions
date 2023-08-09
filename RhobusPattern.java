package com.Apnikaksha.Pattern;

public class RhobusPattern {
    public static void main(String[] args) {

        int row = 5;

        // Outter for loop
        for (int i = 1; i <= row; i++) {

            // Inner for loop for space
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // Inner for loop for star
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
