package chapter13;

import java.security.Principal;
import java.util.function.BiFunction;

import chapter03.returnarray;

class Calculator {
	public static int add(int a, int b) {
		return a + b;

	}
}

public class bifunctiontest {
	public static void main(String[] args) {
		// 2개받고 한개 반환
//		BiFunction<Integer, Integer, Integer> obj=(x1,x2)->x1+x2;
		BiFunction<Integer, Integer, Integer> obj = Calculator::add;
		int result = obj.apply(10, 20); // 오토 언박싱
		System.out.println("주어진 수의 덧셈" + result);

	}
}
