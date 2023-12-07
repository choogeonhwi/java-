package question04;

public class Q06 {
	public static void main(String[] args) {
		// int n [][] = { {10,11,12}, {20,21}, {30,31,32}, {40,41}};
		int sum = 0;
		int n[][] = new int[4][];
		n[0] = new int[3];
		n[1] = new int[2];
		n[2] = new int[3];
		n[3] = new int[2];

		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = (i + 1) * 10 + j;
				sum = n[i][j];
				System.out.print(sum + " ");

			}
			System.out.println();
		}
	}
}
