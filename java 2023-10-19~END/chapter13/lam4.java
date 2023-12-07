package chapter13;

interface mft4 {
	int calc(int x, int y);
}

public class lam4 {
	public static void main(String[] args) {
		printM(3, 4, (x, y) -> x * y);
	}

	static void printM(int x, int y, mft4 f) {
		System.out.println(f.calc(x, y));
	}

}
