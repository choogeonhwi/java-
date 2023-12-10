package question06;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b[] = new int[10];

		System.out.print("양의 정수 10개를 입력하시오>>");

		for (int i = 0; i < 10; i++) {
			b[i] = scanner.nextInt();

			if (i == 0) {
				System.out.print("3의 배수는");
			}

			if (b[i] % 3 == 0) {
				System.out.print(b[i] + " ");

			}

//			 if (b[i]%3 != 0) {
//					
//					continue;
//					
//				}

		}

	}

}