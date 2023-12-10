package question09;

class p2 {
	int x, y;
	String a;

	public p2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return a + "색의 " + "(" + x + "," + y + ")의 점";
	}
}

public class colp2 extends p2 {
	public colp2() {
		this(0, 0);
		this.a = "BLACK";
	}

	public colp2(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		colp2 zeroPoint = new colp2(); // BLACK 색에 (0,0) 위치
		System.out.println(zeroPoint.toString() + "입니다.");
		colp2 cp = new colp2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

	private void setColor(String string) {
		this.a = string;

	}

	private void setXY(int i, int j) {
		move(i, j);

	}
}
