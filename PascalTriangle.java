package com.Apnikaksha.Pattern;

public class PascalTriangle {
    public static void main(String[] args) {
        int coe = 1, row = 8;
        for (int i = 0; i <= row - 1; i++) {

            // Inner for loop for space
            for (int j = 1; j <= row - i; j++) {

                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    coe = 1;
                } else {
                    coe = coe * (i - j + 1) / j;
                }
                System.out.print(coe + " ");

            }
            System.out.println();
        }

    }

}
