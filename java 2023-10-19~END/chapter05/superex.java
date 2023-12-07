package chapter05;

class point2 {
	private int x, y;

	public point2() {
		this.x = 0;
		this.y = 0;

	}

	public point2(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void sp() {
		System.out.println("(" + x + "," + y + ")");

	}
}

class cp2 extends point2 {
	private String color;

	public cp2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void scp2() {
		System.out.print(color);
		sp();
	}
}

public class superex {
	public static void main(String[] args) {
		cp2 cp2 = new cp2(5, 6, "blue");
		cp2.scp2();
	}
}
