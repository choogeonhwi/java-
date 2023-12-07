package question07;

class MP {
	int a, b;

	public MP(int i, int j) {

		a = i;
		b = j;

	}

	@Override

	public String toString() {
		return "Point(" + a + "," + b + ")";
	}
}

public class Q14 {
	public static void main(String[] args) {
		MP p = new MP(3, 50);
		MP q = new MP(4, 50);
		System.out.println(p);
		if (p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}
	}
}
