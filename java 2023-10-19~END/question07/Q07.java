package question07;

import java.util.Scanner;
import java.util.ArrayList;

public class Q07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> s = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String a = scanner.next();
			s.add(a);
			// 값입력
		}

		int l = 0;
		for (int j = 0; j < s.size(); j++) {

			if (s.get(l).length() < s.get(j).length()) {
				// 값호출
				l = j;
			}
		}
		System.out.println(s);
		System.out.println(s.get(l));

	}
}
