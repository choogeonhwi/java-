package test;

import java.util.Scanner;

public class Q01 {
	static int n, m, a, b, c;
	static int[][] arr;
	static int count = 1; // 시작점은 바로 출력
	static int[] x1 = { -1, 0, 1, 0 }; // 방향
	static int[] y1 = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		m = s.nextInt();
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		clean(a, b, c);
		System.out.println(count);
	}

	public static void clean(int x, int y, int z) {

		arr[x][y] = -1; // 클리어

		for (int i = 0; i < 4; i++) {
			z = (z + 3) % 4;
			int n2 = x + x1[z];
			int m2 = y + y1[z];
			if (n2 >= 0 && m2 >= 0 && n2 < n && m2 < m) {
				if (arr[n2][m2] == 0) { // 더러운 방 청소
					count++;
					clean(n2, m2, z);
					return;
				}
			}
		}
		// 후진
		int d = (z + 2) % 4;
		int n3 = x + x1[d];
		int m3 = y + y1[d];
		if (n3 >= 0 && m3 >= 0 && n3 < n && m3 < m && arr[n3][m3] != 1) {
			clean(n3, m3, z);
		}
	}
}
