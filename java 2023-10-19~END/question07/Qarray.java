package question07;

import java.util.Random;

public class Qarray {
	public static void main(String[] args) {
		int a[][] = new int[4][4];
		Random r = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = r.nextInt(10) + 1;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
