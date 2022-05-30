package spring2021;

public class Q6 {

	public static void main(String[] args) {
		String test = "efG.rere.re";

		System.out.println(validString(test));

	}

	public static boolean validString(String str) {
		int dotIndex = str.indexOf('.');
		if (dotIndex == -1 || dotIndex == 0 || dotIndex == str.length() - 1) {
			return false;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}

}
