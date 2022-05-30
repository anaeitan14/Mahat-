package spring2022;

public class q9 {

	public static void main(String[] args) {
		System.out.println('F'-65);
		System.out.println('F'-'A');
		String good = "apmnMNPAMMmm";
		System.out.println(q9(good));

	}

	public static boolean q9(String s) {
		int[] smallLetter = new int[26];
		int[] bigLetter = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				smallLetter[s.charAt(i) - 97]++;
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				bigLetter[s.charAt(i) - 65]++;
			}
		}

		for (int i = 0; i < smallLetter.length; i++) {
			if (smallLetter[i] != bigLetter[i]) {
				return false;
			}
		}

		return true;
	}

}
