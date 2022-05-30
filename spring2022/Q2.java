package spring2022;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = 63;
		int arr[] = randomize(num);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] randomize(int num) {
		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			int randomNum = (int) (Math.random() * 90) + 10;
			if ((randomNum /10) % 10 > randomNum % 10 || (randomNum /10) % 10 == randomNum % 10) {
				int rightDig = randomNum % 10;
				int leftDig = randomNum / 10 % 10;
				int gap = leftDig - rightDig + 1;
				randomNum /= 10;
				randomNum = randomNum * 10 + rightDig + gap;
				if(randomNum == 100) {
					randomNum--;
				}
			}
			arr[i] = randomNum;
		}

		return arr;
	}

}
