package question01;

import java.util.Scanner;

public class question02 {
	public static void main(String[] args) {
		System.out.println("가로, 세로 길이를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println("사각형의 면적은" + a * b + "입니다");

		scanner.close();
	}
}
