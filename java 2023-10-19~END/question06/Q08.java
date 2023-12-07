package question06;

import java.util.Random;

public class Q08 {
	public static void main(String[] args) {
		Random r = new Random();
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int b=0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				System.out.print("랜덤한 정수들 : ");
			}
			a[i] = r.nextInt(10) + 1;
//		b =r.nextInt(a[i]);
			c += a[i];
			System.out.print(a[i] + " ");

		}
		System.out.println();
		System.out.println("평균은" + ((double) c / 10));
	}
}