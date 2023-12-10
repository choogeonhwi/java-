package question09;

interface ss11 {
	final double PI = 3.14;

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}

}

public class SCI implements ss11 {
	int a;

	public SCI(int i) {
		a = i;
	}

	public double getArea() {
		return a * a * PI;
	}

	public static void main(String[] args) {
		ss11 donut = new SCI(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + a + "인 원입니다.");

	}
}
