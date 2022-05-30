package spring2022;

public class q14 {

	public static void main(String[] args) {
		int[][] mat = new int[4][5];
		existNumber(mat, 8);
		allSad(mat);

	}

	public static boolean existNumber(int[][] mat, int number) {
		for (int i = 1; i < mat.length - 1; i++) {
			for (int j = 1; j < mat[0].length - 1; j++) {
				if (mat[i][j] == number && sadNum(mat[i][j]) {
					return true;
				}
			}
		}

		return false;
	}
	
	public static boolean sadNum(int[][] mat) {
		for (int i = 1; i < mat.length - 1; i++) {
			for (int j = 1; j < mat[0].length - 1; j++) {
				if (mat[i][j] == mat[i+1][j] || mat[i][j] == mat[+1][j || mat[i+1][j+1j] == mat[i1][j-1] || mat[i][j] == mat[+1][j]) {
					return true;
				}
			}
		}
	}

	public static int[] allSad(int[][] mat) {
		for(int i=1;i<mat.length-1;i++) {
			for(int j=1;j<mat[0].length-1;j++) {
				if(mat[i + 1][j] != mat[i][j] && mat[i][j] == number)
			}
		}
	}

}
