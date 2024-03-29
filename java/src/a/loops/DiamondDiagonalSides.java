package a.loops;

public class DiamondDiagonalSides {

	static void print(int n) {

		int i, j;

		int num1 = n / 2 * 3;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				// center horizontal, center vertical, upper left diagonal, bottom left
				// diagonal, upper right diagonal, bottom right diagonal
				if (i == n / 2 || j == n / 2 || i + j == n / 2 || i - j == n / 2 || j - i == n / 2 || i + j == num1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] a) {
		// ‘n’ must be odd
		print(9);
	}

}
