package chapter13;

interface mft2 {
	int calc(int x);

}

public class lam2 {
	public static void main(String[] args) {
		mft2 square = x -> x * x;
		System.out.println(square.calc(3));
	}
}
