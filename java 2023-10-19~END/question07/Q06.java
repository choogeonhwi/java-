package question07;

import java.util.StringTokenizer;

public class Q06 {
	public static void main(String[] args) {

		String a[] = { "홍길동", "/", "장화", "/", "홍련", "/", "콩쥐", "/", "팥쥐" };

		for (int i = 0; i < a.length; i++) {
			StringTokenizer s = new StringTokenizer(a[i], "/", false);

			while (s.hasMoreTokens()) {
				System.out.println(s.nextToken());

			}
		}

	}
}
