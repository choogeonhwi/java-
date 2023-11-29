package question03;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		System.out.print("입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		int z = 0;
		int x = 0;
		int c = 0;

		z = a / 10;
		x = a % 10;

		if (z % 3 == 0) {
			c++;
		}

		if (x % 3 == 0 && x != 0) {
			c++;
		}

		if (c == 2) {
			System.out.println("박수짝짝");
		} else if (c == 1) {
			System.out.println("박수짝");
		} else {
			System.out.println("박수없음");
		}
	}
}
