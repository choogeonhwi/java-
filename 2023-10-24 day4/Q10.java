package question01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
	System.out.println("3자리 정수 입력");
	Scanner scanner = new Scanner(System.in);
	
	int a = scanner.nextInt();
	
	int b= a/100;
	double c=(a%100)/10;
	int d=a%10;
	
	double e= b+c;
	double f= c*d;
	
	System.out.println("테스트"+d);
	System.out.println("합"+e);
	System.out.println("곱"+f);
	
	scanner.close();
	}
}