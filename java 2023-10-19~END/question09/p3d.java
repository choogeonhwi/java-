package question09;

class p3 {
	int a, b, c;

	public p3(int i, int j, int k) {
		a = i;
		b = j;
		c = k;

	}

	protected void move1(int x, int y) {
		a = x;
		b = y;

	}

	protected void move2(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	@Override
	public String toString() {

		return "(" + a + "," + b + "," + c + ")" + "의 점";
	}
}

public class p3d extends p3 {
	int k;

	public p3d(int i, int j, int k) {
		super(i, j, k);
		this.k = k;

	}

	public static void main(String[] args) {
		p3d p = new p3d(1, 2, 3); // 1, 2, 3은 각각 x, y, z축의 값.
		System.out.println(p.toString() + "입니다.");
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		p.move(100, 200, 300); // x, y, z 축으로 이동
		System.out.println(p.toString() + "입니다.");
	}

	private void moveUp() {
		c = k + 1;

	}

	private void moveDown() {

		c = c - 1;
	}

	private void move(int l, int m) {
		move1(l, m);

	}

	private void move(int l, int m, int n) {
		move2(l, m, n);
	}

}
//(1,2,3)의 점입니다.
//(1,2,4)의 점입니다.
//(10,10,3)의 점입니다.
//(100,200,300)의 점입니다