package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class M2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			l.add(i);
		}
		System.out.println(l);

		Stream<Integer> myStream = l.stream();
		myStream.filter(s -> (s >= 5)).forEach(n -> System.out.println(n)); // 연산 필터or맵 -> forE
		System.out.println(l); // 연산 후에도 원데이터 고정
	}
}
