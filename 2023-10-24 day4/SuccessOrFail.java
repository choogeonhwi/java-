package chapter02;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		//점수 입력 80이상 합격 출력
		System.out.println("정수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if (score >= 80) {
			System.out.println("합격");
		}
		scanner.close();
		
		
		
		
		
	}
}
