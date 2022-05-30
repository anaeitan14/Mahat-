package summer2021;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String first = s.nextLine();
		String second = s.nextLine();

		System.out.println(isCopyK(first, second));

	}

	static boolean isCopyK(String first, String second) {

		int firstLength = first.length();
		String mutation = "";

		while (firstLength >= mutation.length()) {
			mutation += second;
			if (mutation.equals(first)) {
				return true;
			}
		}

		return false;
	}

}
