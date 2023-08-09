package com.Apnikaksha.Pattern;

public class HollowRohbus {
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

                if (i == 1 || j == 1 || i == row || j == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
