package question04;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[10];
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("입력하세요");
			a[i] = scanner.nextInt();
			sum += a[i];

		}
		System.out.println(sum);
	}
}
