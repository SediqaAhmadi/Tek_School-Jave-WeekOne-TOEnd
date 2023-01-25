package com.week.three.day.four;

import java.util.Scanner;

public class ExcampleForSelection {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 Number? ");
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();
		int numberD = scanner.nextInt();
		scanner.close();
		// Activity: find the largest number.

		// A > B && A > C
		if (numberA > numberB && numberA > numberC && numberA > numberD) {
			System.out.println("A is Largest " + numberA);
		} else if (numberB > numberA && numberB > numberC && numberB > numberD) {
			System.out.println("B is largest " + numberB);
		} else if (numberC > numberA && numberC > numberB && numberC > numberD) {
			System.out.println("C is largest " + numberC);
		} else if (numberD > numberA && numberD > numberB && numberD > numberC) {
			System.out.println("D is largest " + numberD);
		} else {
			System.out.println("Numbers are equal ");
		}

		// Break till 8:45 PM EST
	}

}
