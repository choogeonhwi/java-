package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class M4 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		int sum1 = l.stream().mapToInt(n -> n).sum();
		int s2 = IntStream.of(20, 10, 30).sum();
		System.out.println(sum1);
		System.out.println(s2);
	}
}
