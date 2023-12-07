package chapter13;

interface mft {
	int calc(int x, int y);
}

public class lambdaEx1 {
	public static void main(String[] args) {
		mft add = (x, y) -> {
			return x + y;
		};
		mft mi = (x, y) -> x - y;

		System.out.println(add.calc(1, 2));
		System.out.println(mi.calc(1, 2));

	}

}
