package chapter02;

public class VarianleExchangeExample {
	public static void main(String[] args) {
		int x=3;
		int y=5;
		System.out.println("x:"+x+",y:"+y);
		
		int temp=x;
		// x값을 임시저장
		x=y;
		// 임시값을 y에 저장
		y=temp;
		System.out.println("x:"+x+",y:"+y);
	}
}
