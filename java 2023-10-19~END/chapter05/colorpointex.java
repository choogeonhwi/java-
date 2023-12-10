package chapter05;

//한점을 표현, 상속받는 클래스
class point {
	private int x, y; // 4. 필드가 값 받음

	public void set(int x, int y) { // 2. 1,2 받음
		this.x = x;
		this.y = y;// 3. 1,2 세팅
	}

	public void sp() {
		System.out.println("(" + x + "," + y + ")");
	}

}

class cp extends point {
	// 서브클래스
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public void scp() {
		System.out.print(color);
		sp();
	}
}

public class colorpointex {
	public static void main(String[] args) {
		point p = new point(); // 객체 생성, 멤버4개, 생성자 호출(기본)
		// 1.메소드 호출
		p.set(1, 2);
		p.sp();

		cp cp = new cp();
		cp.set(3, 4);
		// 상속받은 멤버까지 7개, 상위 슈퍼 클래스 우선실행
		cp.sp();

		cp.setColor("red");
		cp.scp();
	}
}
