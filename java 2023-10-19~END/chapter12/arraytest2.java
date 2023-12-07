package chapter12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraytest2 {
	public static void main(String[] args) {
		String a[] = { "a", "b", "c", "d" };
		int b[] = { 1, 5, 5, 7, 3, 3, 42, 6, 8, 45323, 4, 63, 2, 1 };
		System.out.println(Arrays.asList(a)); // 리스트 컬렉션
		List<String> list = Arrays.asList(a);
		System.out.println("@#! list.get(0)--->" + list.get(0));

		Arrays.sort(b, 4, 14);
		System.out.println(Arrays.toString(b));

		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

		Arrays.sort(a); // 오름차순
		System.out.println(Arrays.toString(a));

		Arrays.sort(a, 2, 4, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

		String[] cc = { "11", "12", "13", "23", "53", "223", "145", "53", };
		Arrays.parallelSort(cc, Collections.reverseOrder());
		System.out.println(Arrays.toString(cc)); // 스트링으로

		int[] c = Arrays.copyOf(b, b.length);
		System.out.println(Arrays.toString(c));

		String[] d = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(d));

//				[a, b, c, d]
//				@#! list.get(0)--->a
//				[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45323]
//				[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
//				[d, c, b, a]
//				[a, b, c, d]
//				[a, b, d, c]
//				[53, 53, 23, 223, 145, 13, 12, 11]
//				[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
//				[a, b, d]

	}
}
