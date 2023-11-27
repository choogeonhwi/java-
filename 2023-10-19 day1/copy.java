package chapter02;

public class copy {
	public static void main(String[] args) {
		// string 타입
		// origin 변수명
		// string 타입의 변수 선언
		// String origin;
		String origin = "가나다라";
		String copy = origin;
		System.out.println(origin);
		System.out.println(copy);

		copy = copy + "마바사";
		System.out.println(copy);
	}
}
