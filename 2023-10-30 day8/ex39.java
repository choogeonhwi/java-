package chapter03;

public class ex39 {
	public static void main(String[] args) {

		int[][] g = new int[10][10];

		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				g[i][j] = i * j;
			}
		}
		System.out.println(g[2][7]);

	}
}
