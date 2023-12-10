package chapter13;

@FunctionalInterface
interface mft5<T> { // 제네릭
	void print(T x);
//	void print2();
}

public class lam5 {
	public static void main(String[] args) {

		mft5<String> f1 = (x) -> System.out.println(x);
		f1.print("ABC");
		mft5<Integer> f2 = (x) -> System.out.println(x);
		f2.print(Integer.valueOf(100));
		f2.print(100); // 오토 박싱
	}
}
