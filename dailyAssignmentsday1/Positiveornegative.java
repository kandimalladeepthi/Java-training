package com.java.dailyAssignmentsday1;
import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}

	}

}
