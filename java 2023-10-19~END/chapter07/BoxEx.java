package chapter07;

public class BoxEx {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // 업캐스팅 Box 클래스 안 필드에 세팅
		String name = (String) box.get();
		System.out.println(name);

		box.set(777);
		int n = (int) box.get();

		System.out.println(n);

		box.set(new apple());
		apple apple = (apple) box.get();
		System.out.println(apple);
		// 객체의 값 주소

	}
}
