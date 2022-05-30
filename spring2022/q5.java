package spring2022;

public class q5 {

	public static void main(String[] args) {

		int[] a = { 1, 7, 3, 0, 13, 141, 44};
		System.out.println(perfectArr(a));

	}

	public static boolean perfectArr(int[] arr) {
		boolean goodLength = arr.length % 2 == 1;
		boolean middleZero = arr[arr.length / 2] == 0;
		boolean posNumberHalf = true;
		boolean noPosNumberHalf = true;

		for (int i = 0; i < arr.length / 2-1; i++) {
			if (!(arr[i] > 0 && arr[i] < 10)) {
				posNumberHalf = false;
			}
		}

		for (int i = arr.length / 2+1; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] < 10) {
				noPosNumberHalf = false;
			}
		}

		if (goodLength && middleZero && posNumberHalf && noPosNumberHalf) {
			return true;
		}

		return false;
	}
	
	// The complexity of the function is O(n) because our loop runs accordingly to the length of the input array.

}