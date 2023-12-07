package chapter14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamEx1 {
	public static void main(String[] args) {
		List<Integer> nu = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("입력" + nu);

		List<Integer> r = nu.stream().filter(n -> {
			return n % 2 == 0;
		}).map(n -> {
			return n * n;
		}).collect(Collectors.toList());
		System.out.println("실행결과=" + r);
	}
}
