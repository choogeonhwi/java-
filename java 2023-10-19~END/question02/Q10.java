package question02;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		System.out.print("정수를 입력>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		int b = 0;
		int z = 0;
		int x = 0;
		int c = 0;

		b = a / 60;
		z = b / 60;
		x = b - z * 60;
		c = a % 60;

		System.out.println(z + "시간" + x + "분" + c + "초");

	}
}
