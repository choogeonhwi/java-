package chapter03;

import java.util.Scanner;

public class loopex2 {
	public static void main(String[] args) {
		System.out.println("구구단입력");
		Scanner scanner = new Scanner(System.in);

		int b = 1;
		int c = scanner.nextInt();

		while (b <= 9) {
			System.out.println("구구단" + c * b);
			b++;
		}
	}
}
