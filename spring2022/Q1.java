package spring2022;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int numberAmount = 0;
		int numSum = 0;
		int equalPair = 0;
		int num1, num2;

		do {
			System.out.println("Enter first num");
			num1 = s.nextInt();
			System.out.println("Enter second num");
			num2 = s.nextInt();
			numberAmount += 2;
			if (num1 > 0 && num2 > 0) {
				numSum += num1 + num2;
			}
			if (num1 == num2) {
				equalPair++;
			}

		} while (num1 + num2 != 0);

		System.out.println("Amount of numbers entered " + numberAmount);
		System.out.println("Sum of numbers entered " + numSum);
		System.out.println("Amount of equal pairs " + equalPair);

	}

}
