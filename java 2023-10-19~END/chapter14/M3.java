package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class M3 {
	public static void main(String[] args) {
		List<String> sl = new ArrayList<>();
		sl.add("TOMAS");
		sl.add("EDWARD");
		sl.add("JACK");

		Stream<String> st = sl.stream();
		// 요소확인
		sl.stream().forEach(s -> System.out.print(s + " "));
		System.out.println("\n-----------------------");

//		정렬 오름차순
		sl.stream().sorted().forEach(s -> System.out.println(s + " "));
		System.out.println("\n-----------------------");

//		map -> 길이
		sl.stream().map(s -> s.length()).forEach(n -> System.out.print(n));
		System.out.println("\n-----------------------");

		sl.stream().filter(s -> s.length() >= 5).forEach(n -> System.out.println(n + " "));
	}
}
