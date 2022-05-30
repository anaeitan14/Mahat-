package spring2022;

public class Q3Summer {

	public static void main(String[] args) {
		int a[] = { 13, 6, 3, 13, 6, 3, 13, 6, 3 };
		System.out.println(triangle2(a));

	}

	public static boolean triangle(int[] arr) {
		if (arr.length % 3 == 1) {
			return false;
		}

		int partSize = arr.length / 3;

		for (int i = 0; i < 3; i++) {
			if (!(arr[i] == arr[i + partSize] && arr[i + partSize] == arr[i + partSize * 2])) {
				return false;
			}
		}

		return true;
	}

	public static boolean triangle2(int[] arr) {
		if (arr.length % 3 == 1)
			return false;

		for (int i = 0, j = arr.length / 3, k = arr.length / 3 * 2; k < arr.length; i++, j++, k++)
			if (!(arr[i] == arr[j] && arr[j] == arr[k]))
				return false;

		return true;
	}

}
