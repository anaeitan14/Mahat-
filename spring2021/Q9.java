package spring2021;

public class Q9 {

	public static void main(String[] args) {
		String s1 = "fA%B##rkC1^BAdd";
		String[] arr = { "fA%B##rkC1^BAdd", "fA%B##rkC1^BAde", "fA%B##rkC1^BAdE" };
		System.out.println(func(s1));
		System.out.println(func2(arr));

	}

	public static boolean func(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char leftLetter = s.charAt(left);
			char rightLetter = s.charAt(right);
			if (leftLetter >= 'A' && leftLetter <= 'Z' && rightLetter >= 'A' && rightLetter <= 'Z'
					&& leftLetter != rightLetter) {
				return false;
			} else if (!(leftLetter >= 'A' && leftLetter <= 'Z')) {
				left++;
			} else if (!(rightLetter >= 'A' && rightLetter <= 'Z')) {
				right--;
			} else {
				right--;
				left++;
			}
		}
		return true;
	}

	public static String func2(String[] arr) {
		int max = 0, stringIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (func(arr[i]) && arr[i].length() > max) {
				max = arr[i].length();
				stringIndex = i;
			}
		}

		return arr[stringIndex];
	}

}
