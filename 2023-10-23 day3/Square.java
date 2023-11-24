package chapter02;

public class Square { 
	public static void main(String[] args) {
		          //리턴x
		
		int n=1;
	//	square();//호출부
	int s = square(n);//호출부
	// 호출 값을 변수로 담는다
	System.out.println("한변의 길이가 "+n+"인 정사각형의 넓이 : "+s);
	}
	public static int square(int n) {
		//return 0;// "";=문자열은 타입불일치
		return n*n;
		
	}
	// 1. 메소드 호출    2.n으로 받음    3.n을 제곱으로 반환    4.16을 받음    
}
