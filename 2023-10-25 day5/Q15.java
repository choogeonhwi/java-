package question01;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		System.out.println("정수 3개 입력");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a>=b && b>=c) {
			System.out.println("최소값:"+c+"최대값:"+a);
		}else if(b>=a && a>=c) {
			System.out.println("최소값:"+c+"최대값:"+b);
		}else if(a>=c && c>=b) {
			System.out.println("최소값:"+b+"최대값:"+a);
		}else if(c>=a && a>=b) {
			System.out.println("최소값:"+b+"최대값:"+c);
		}else if(c>=b && b>=a) {
			System.out.println("최소값:"+a+"최대값:"+c);
		}else if(b>=c && c>=a) {
			System.out.println("최소값:"+a+"최대값:"+b);
		}
 }
}
