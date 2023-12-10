package chapter04;

public class Circle {
	int radius; // 필드
	String name;

	/* 오버로딩=매개변수의 갯수에 중첩되는 형태 */
	public Circle() {
		// 생성자
	}

	public Circle(int a) {
		// 생성자
	}

	public Circle(int a, int b) {
		// 생성자
	}

	public double getArea() {
		// 메소드
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle pizza; // 참조변수
//		new Circle();//객체
		pizza = new Circle();
		// 멤버 3개
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);

		Circle DONUT = new Circle();

		DONUT.radius = 2;
		DONUT.name = "자바도넛";
		area = DONUT.getArea();
		System.out.println(DONUT.name + "의 면적은" + area);

	}
}
