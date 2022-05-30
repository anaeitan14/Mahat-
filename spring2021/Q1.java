package spring2021;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int evenNumCount = 0;
		int unEvenSum = 0;

		for (int i = 0; i < 5; i++) {
			int num = s.nextInt();
			if (num > 99 && num < 1000) {
				System.out.println("Digit sum is " + (num % 10 + num / 10 % 10 + num / 100 % 10));
			}
			if (num % 2 == 0) {
				evenNumCount++;
			} else {
				unEvenSum += num;
			}

		}

		System.out.println("There are " + evenNumCount + " even numbers");
		System.out.println("The sum of the uneven numbers is " + unEvenSum);

	}

}
