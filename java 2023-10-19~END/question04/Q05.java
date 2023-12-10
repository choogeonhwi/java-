package question04;

public class Q05 {
	public static void main(String[] args) {
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println();
			for (int j = 0; j < n[i].length; j++) {
				sum = n[i][j];
				System.out.print(sum);

			}
		}

	}
}
