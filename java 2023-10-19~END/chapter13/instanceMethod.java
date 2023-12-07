package chapter13;

import java.util.function.Supplier;

public class instanceMethod {
	// 서플라이어 인터페이스 매개변수없고 반환값만 존재
	// 정수 타입 f=()->s.length();
	static void print(Supplier<Integer> f) {
		System.out.println(f.get());
	}

	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(s.length());
		print(() -> s.length()); // 일반 람다식
		print(s::length); // 메소드 참조 람다식

	}
}
