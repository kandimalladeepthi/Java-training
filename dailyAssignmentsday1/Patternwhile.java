package com.java.dailyAssignmentsday1;

public class Patternwhile {
    public static void main(String[] args) {
        int rows = 3;
        int i = 1;
        int num = 1;
        
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                num++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
