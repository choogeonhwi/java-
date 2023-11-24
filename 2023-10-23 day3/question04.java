package question01;

import java.util.Scanner;

public class question04 {
	public static void main(String[] args) {
		System.out.println("2개의 실수 입력");
		 Scanner scanner = new Scanner(System.in);
		
		 
		 double a = scanner.nextDouble();
		 double b = scanner.nextDouble();
		
		 System.out.println("덧셈="+(a+b));
		 System.out.println("뺄셈="+(a-b));
		 System.out.println("곱셈="+a*b);
		 System.out.println("나눗셈="+a/b);
		
		
		
		
		scanner.close();
	}
}
