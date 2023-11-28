package question01;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		System.out.println("x,y 좌표를 입력>>");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		
		if ((x>200) || (y>200)) {
			System.out.println(x+","+y+"는 사각형 안에 없습니다");
		}else if((x>=100) && (y>=100)){
			System.out.println(x+","+y+"는 사각형 안에 있습니다.");
		}
		else {
			System.out.println(x+","+y+"는 사각형 안에 없습니다");
		}
		scanner.close();
	}
}
