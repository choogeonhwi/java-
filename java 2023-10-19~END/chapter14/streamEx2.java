package chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamEx2 {
	public static void main(String[] args) {
		List<String> w = Arrays.asList("J", "S", "L");
		System.out.println("입력" + w);
		List<Integer> r = w.stream().map(String::length).collect(Collectors.toList());
		System.out.println("실행결과" + r);
	}
}
