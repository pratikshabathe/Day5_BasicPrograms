package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of x and y ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("before swapping number: " +x +" " +y);
		
		x = y;
		y = x;
		System.out.println("After swapping: " +x +" " +y);
	}
}
