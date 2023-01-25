package com.week.three.day.four;

import java.util.Scanner;

public class GradesExample {
	public static void main(String[] args) {
		// 1 - 100;
		// A = 90 - 100
		// B = 80 - 89
		// C = 70 - 79
		// D = 60 - 69
		// F = less that 60
		// base on score print grade. Use Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your score? between 1 - 100");
		int score = scanner.nextInt();
		scanner.close();

		if (score >= 90 && score <= 100) {
			System.out.println("Your grade is A");
		} else if (score >= 80 && score < 90) {
			System.out.println("Your grade is B");
		} else if (score >= 70 && score < 80) {
			System.out.println("Your grade is C");
		} else if (score >= 60 && score < 70) {
			System.out.println("Your grade is D");
		} else if (score >= 0 && score < 60) {
			System.out.println("Your Grade is F and You Failed");
		}else {
			System.err.println("Wrong entry for score ");
		}
	}

}

