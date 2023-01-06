package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a number (0 - 31)");
		do {
			num = sc.nextInt();
			if (num > 31 || num < 0) {
				System.out.println("this not valid, Enter again");
			}
		} while ( num > 31 || num < 0);
		sc.close();
		
		for(int i = 0; i <= num; i++) {
		System.out.println(2*i);
		}
	}
}
