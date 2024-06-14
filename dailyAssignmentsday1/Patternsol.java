package com.java.dailyAssignmentsday1;

public class Patternsol {
    public static void main(String[] args) {
        int rows = 3;
        int col = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
        }
    }
}
