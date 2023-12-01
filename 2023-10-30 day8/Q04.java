package question04;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {

		int num[] = new int[5];
		double sum = 0;

		System.out.println("숫자 5개를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			sum += num[i];
		}

		System.out.println("평균" + sum / num.length);
		scanner.close();
	}
}
