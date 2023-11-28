package question01;

import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		System.out.println("정수 3개 입력");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		if(a>=b) {
			if(b>=c) {
				System.out.println("중간 값은:"+b);
			}else if(c<=a) { // 앞에 조건이 참= 미실행
				System.out.println("중간 값은:"+c);
			}else {
				System.out.println("중간 값은:"+a);
			}	
		} else if(a>=c) { // c<=a<=b
			System.out.println("중간 값은:"+a);
		}else if(b>=c) { // a<=c<=b
			System.out.println("중간 값은:"+c);
		}else {         //  a<=b<=c
			System.out.println("중간 값은:"+b);
		}
		
		scanner.close();
			}
	
}
