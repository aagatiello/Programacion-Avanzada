package org.practica;

import java.util.Scanner;

public class MathDiscount {

	static int[][] discount = new int [1][1];

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose discount: 1. Product x Product  2. %");
		int op = sc.nextInt();
		if(op == 1) {
			System.out.println("How many books have you borrowed");
			int a = sc.nextInt();
			System.out.println("How many movies have you borrowed");
			int b = sc.nextInt();
			int c = (Math.max(a, b));
			System.out.println("You will only have to pay for: " + c + " products.");
		} else if (op == 2) {
			int num = (int) (Math.random() * (75 - 10 + 1)) + 10;
			discount[0][0] = num;
			System.out.println("You have a discount of: " + discount[0][0] + " %.");
		}
	}
}

