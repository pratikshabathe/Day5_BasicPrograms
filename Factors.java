package com.bridgelabz;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find prime factors");
		int num = sc.nextInt();
		
		for (int i =3; i <= num; i++) {
			while (num % 2 == 0) {
				num = num/2;
				System.out.println(2 );
			}
			while (num % i == 0) {
				num = num/i;
				System.out.println(i);
			}
		}
	}
}
