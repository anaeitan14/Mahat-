package spring2022;
import java.util.Scanner;

public class FXP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		boolean opposite = false;

		int numberCount = 0;
		int posSum = 0;
		int equalNum = 0;

		while (!opposite) {
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			numberCount++;
			opposite = num1 + num2 == 0;
			if (num1 > 0) {
				posSum += num1;
			} else if (num2 > 0) {
				posSum += num2;
			}
			if (num1 == num2) {
				equalNum++;
			}

		}

		System.out.printf("Total amount of %d numbers were recieved\n", numberCount);
		System.out.printf("Total amount of pos numbers was %d\n", posSum);
		System.out.printf("Total amount of %d numbers were equal\n", equalNum);

	}

}
