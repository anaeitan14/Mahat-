package summer2021;

public class Q4 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 11, 10, 9, 3, 2, 0 };
		System.out.println(peakArr(arr));

	}

	public static int peakArr(int[] arr) {
		int peak = 0;
		boolean descending = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				peak = i;
				break;
			}
		}

		for (int i = peak; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				descending = false;
				break;
			}
		}

		if (descending) {
			return peak;
		} else {
			return -1;
		}

	}

}