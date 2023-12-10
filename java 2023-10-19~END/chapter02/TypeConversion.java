package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		// 큰 타입인 int를 따라감
		System.out.println(b + i);
		System.out.println(10 / 4);
		System.out.println(10.0 / 4); // double로 따라감
		System.out.println(2.9 + 1.8);
		System.out.println((int) 2.9 + 1.8); // 각각의 캐스팅이 요구됨
		System.out.println((int) 2.9 + (int) 1.8);
		System.out.println((int) (2.9 + 1.8));

	}
}
