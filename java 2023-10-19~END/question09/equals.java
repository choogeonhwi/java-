package question09;

class c {
	int x, y, r;

	public c(int a, int b, int c) {
		x = a;
		y = b;
		r = c;
	}

	@Override
	public String toString() {

		return "circle" + "(" + x + "," + y + ")" + "반지름" + r;
	}

	@Override
	public boolean equals(Object obj) {
		c a = (c) obj;
		if (x == a.x && y == a.y)
			return true;
		else
			return false;
	}
}

public class equals {

	public static void main(String[] args) {
		c a = new c(2, 3, 5);
		c b = new c(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b)) {
			System.out.println("같은 원");

		} else {
			System.out.println("서로 다른 원");
		}

	}
}
