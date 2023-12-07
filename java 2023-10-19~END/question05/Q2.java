package question05;

public class Q2 {
	public static void main(String[] args) {
		int a[][] = { { 35, 36, 37, 38, 39 }, { 45 }, { 55, 56, 57, 58 }, { 65, 66 }, { 75, 76, 77 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
