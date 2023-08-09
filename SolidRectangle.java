package com.Apnikaksha.Pattern;

public class SolidRectangle {

    public static void main(String[] args) {

        int row = 4;
        int column = 5;

        // Outer Loop
        for (int i = 1; i <= row; i++) {

            // Inner Loop
            for (int j = 1; j <= column; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }

}
