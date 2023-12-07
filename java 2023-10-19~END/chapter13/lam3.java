package chapter13;

interface mft3 {
	void print();
}

public class lam3 {
	public static void main(String[] args) {
		mft3 f = () -> {
			System.out.println("hello");
		};
		f.print();
		f = () -> System.out.println("안녕");
		f.print();
	}
}
