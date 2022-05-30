package spring2021;

public class Q4 {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 3, 0, 13, 131, 44 };

		System.out.println(perfectArray(arr));

	}

	public static boolean perfectArray(int[] arr) {

		boolean goodLength = arr.length % 2 == 1;
		boolean goodMiddle = arr[arr.length/2] == 0;
		boolean firstGood = true;
		boolean secondGood = true;

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] < 0 || arr[i] > 9) {
				firstGood = false;
			}
		}

		for (int i = (arr.length / 2)+1; i < arr.length; i++) {
			if (arr[i] < 10) {
				secondGood = false;
			}
		}

		if (goodLength && firstGood && secondGood && goodMiddle) {
			return true;
		} else {
			return false;
		}
	}

}
