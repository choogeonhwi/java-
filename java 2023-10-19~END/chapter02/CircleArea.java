package chapter02;

public class CircleArea {
	public static void main(String[] args) {
		double pi = 3.14;
		int radius = 10;
		double circleArea = radius * radius * pi; // 원넓이공식, 숫자 연산시 결과는 큰 타입으로 따라감
		System.out.println("원 면적=" + circleArea);
	}
}
