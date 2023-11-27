package question01;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요>>");
		 Scanner scanner = new Scanner(System.in);
		
		
		
		 
	//	 double b = scanner.nextDouble();  
	//	 int a = (int) b; 
		// 큰 타입에서 작은 타입으로 담고 싶으면 캐스팅을 이용
		 
		 int b = scanner.nextInt();
		 double a = b; 
		 
		 System.out.println(b+"원은"+"$"+(a/1200)+"입니다.");
		 System.out.println(b+"원은"+"E"+(a/1500)+"입니다.");
			
			
			
			scanner.close();
		
		
	}
}
