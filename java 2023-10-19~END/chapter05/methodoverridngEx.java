package chapter05;

class shape {
	public void draw() {
		System.out.println("shape");
	}

}

class line extends shape {
	@Override // (시스템 주석)
	public void draw() {
		System.out.println("line");

	}
}

class rect extends shape {
	@Override // (시스템 주석)
	public void draw() {
		System.out.println("rect");

	}
}

class circle extends shape {
	@Override // (시스템 주석)
	public void draw() {
		System.out.println("circle");

	}
}

public class methodoverridngEx {
	static void paint(shape p) {
		p.draw(); // 업캐스팅
		// 업캐스팅에 의해 슈퍼클래스의 드로우 메소드를 갔다 오버라이딩으로 동적바인딩이 실행되어 라인으로 감
	}

	public static void main(String[] args) {
		line line = new line();
		paint(line);
		paint(new shape());
		paint(new line());
		paint(new rect());
		paint(new circle());
		// 슈퍼클래스를 제외한 전체클래스가 업캐스팅 ->오버라이딩

	}
}
