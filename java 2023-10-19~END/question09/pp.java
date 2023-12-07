package question09;

class p4 {
	int a, b;
	int c;
	int d;

	public p4(int i, int j) {
		this.a = i;
		this.b = j;
		this.c = i;
		this.d = j;

	}

	void move1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		if (a < 0 || b < 0) {
			a = a - c;
			b = b - d;
			return "(" + a + "," + b + ")의 점";
		}

		return "(" + a + "," + b + ")의 점";

	}
}

public class pp extends p4 {

	public static void main(String[] args) {
		pp p = new pp();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		pp p2 = new pp(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

	void move(int a, int b) {
		if (a > 0 && b > 0) {
			move1(a, b);
		}

	}

	public pp(int i, int j) {
		super(i, j);
		if (i < 0 || j < 0) {
			super.move1(i * -1, j * -1);
		}
	}

	public pp() {
		super(0, 0);
	}
}

//(10,10)의 점입니다.
//(10,10)의 점입니다.
//(0,0)의 점입니다.