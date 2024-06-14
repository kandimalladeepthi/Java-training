package com.java.dailyAssignmentsday1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int factorial=1;
		int i=1;
		do {
			factorial=factorial*i;
			i++;
		}
		while(i<=number) ;
			System.out.println("Factorial of " + number + " is: " + factorial);
			
		

	}

}
