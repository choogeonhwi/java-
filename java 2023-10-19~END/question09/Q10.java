package question09;

interface ss111 {
	final double PI = 3.14;

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}

}

class c1 implements ss111 {
	int r;

	public c1(int i) {
		r = i;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + r + "인 원입니다.");

	}

	@Override
	public double getArea() {

		return r * r * PI;
	}

}

class o1 implements ss111 {
	int x, y;

	public o1(int i, int j) {
		x = i;
		y = j;
	}

	@Override
	public void draw() {
		System.out.println(x + "x" + y + "에 내접하는 타원입니다");

	}

	@Override
	public double getArea() {

		return PI * x * 1 / 2 * y * 1 / 2;

	}

}

class r1 implements ss111 {
	int x, y;

	public r1(int i, int j) {
		x = i;
		y = j;
	}

	@Override
	public void draw() {
		System.out.println(x + "x" + y + "크기의 사각형 입니다.");

	}

	@Override
	public double getArea() {

		return x * y;
	}

}

public abstract class Q10 implements ss111 {
	static public void main(String[] args) {
		ss111[] list = new ss111[3]; // Shape 인터페이스 타입인 레퍼런스 배열
		list[0] = new c1(10); // 반지름이 10인 원 객체
		list[1] = new o1(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new r1(10, 40); // 10x40 크기의 사각형
		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}

}
