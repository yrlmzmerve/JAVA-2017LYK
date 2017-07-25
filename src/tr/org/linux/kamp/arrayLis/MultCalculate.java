package tr.org.linux.kamp.arrayLis;

public class MultCalculate {

	public static int[][] initialize(int n) {

		int[][] matrices = new int[n][n];

		for (int i = 0; i < matrices.length; i++) {
			for (int j = 0; j < matrices[i].length; j++) {
				matrices[i][j] = (j + 1) * (i + 1);
			}

		}

		return matrices;
	}

	public static void aPrint(int[][] matrices) {
		for (int i = 0; i < matrices.length; i++) {
			for (int j = 0; j < matrices[i].length; j++) {
				System.out.print(matrices[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		aPrint(initialize(8));

	}

}
