package chapter07;

public class Box2Ex {
	public static void main(String[] args) {
		Box2<String> box1 = new Box2<>();
		// 다이아몬드 연산자
		box1.set("hello");
//	box1.set(777); // 컴파일 단계에서 감지
		String greet = box1.get();
		System.out.println(greet);

		Box2<Integer> box2 = new Box2<>();

		box2.set(777);

		int value = box2.get();
		System.out.println(value);
	}
}
