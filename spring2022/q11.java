package spring2022;

public class q11 {

	public static void main(String[] args) {
		int num = 12551;
		int[] arr = { 12551, 4, 6125, 77, 4254, -561 };
		System.out.println(isSpecialArray(arr));

	}

	public static boolean specialNumber(int num) {
		if (num < 10 || num < 0) {
			return false;
		}

		int evenSum = 0, unevenSum = 0, index = 0;
		while (num > 0) {
			if (index % 2 == 0) {
				evenSum += num % 10;
			} else {
				unevenSum += num % 10;
			}
			index++;
			num /= 10;
		}

		if (evenSum == unevenSum) {
			return true;
		}

		return false;
	}

	public static boolean isSpecialArray(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (specialNumber(arr[i]) && !specialNumber(arr[i - 1])) {
				return false;
			}
		}
		return true;

	}
}
