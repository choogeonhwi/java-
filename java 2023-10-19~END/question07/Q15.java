package question07;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("공간의 크기를 입력하세요 N,M>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int N[] = new int[x];
		int M[] = new int[y];
		int r, c, d = 0;
		int q = 0;
		int w = 0;
		int o = 0;
		int ii = 0;
		int ll = 0;

		if ((3 <= x && x <= 50) && (3 <= y && y <= 50)) {
			System.out.print("청소기 좌표를 입력하세요>>");
			r = scanner.nextInt();
			c = scanner.nextInt();
			System.out.print("청소기 방향을 선택하세요>>");
			d = scanner.nextInt();
			if (d == 0) {

				System.out.println("북");

			}
			if (d == 1) {
				System.out.println("동");
			}
			if (d == 2) {
				System.out.println("남");
			}
			if (d == 3) {
				System.out.println("서");
			}
			System.out.print("방의 상태를 입력하세요>>");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {

					q = scanner.nextInt();
					M[j] = q;
					w += q;

				}
			}
			ii = x * y;
			System.out.println(ii + "  " + w);
			ll = ii - w;

			System.out.println("청소한 칸의 갯수: " + ll);

		}

	}
}
