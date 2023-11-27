package question01;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double d = (a+b)*c/2;
		double f = 1/2*a*b;
		
		if (c == 0) {
			System.out.println("삼각형"+f);
		}else {
		   System.out.println("사다리"+d);
		}
		
		scanner.close();
		
}
}
