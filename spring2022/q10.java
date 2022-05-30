package spring2022;

public class q10 {

	public static void main(String[] args) {
		int[] arr = {34,654,34,1234,1331,1771};
		arrayGolden(arr);

	}

	public static boolean goldenPair(int num1, int num2) {
		int length1 = 0, length2 = 0;
		if (num1 % 10 != num2 % 10) {
			return false;
		}

		while (num1 != 0 || num2 != 0) {
			if ((num1 / 10 == 0 && num2 / 10 == 0) && num1 != num2) {
				return false;
			}
			length1++;
			length2++;
			num1 /= 10;
			num2 /= 10;
		}

		if (length1 != length2) {
			return false;
		}

		return true;
	}

	public static boolean goldenPair2(int num1, int num2) {
		if (num1 % 10 != num2 % 10)
			return false;
		while (num1 != 0 && num2 != 0) {
			num1 = num1 / 10;
			num2 = num2 / 10;
		}
		return num1 == 0 && num2 == 0;
	}

	public static void arrayGolden(int[] arr) {
		boolean pairExist = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (goldenPair(arr[i], arr[j])) {
					pairExist = true;
					System.out.println(arr[i]);
					System.out.println(arr[j]);
				}
			}
		}

		if (!pairExist) {
			System.out.println("No golden pairs in this array");
		}
	}

}
