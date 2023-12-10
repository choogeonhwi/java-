package chapter03;

//특정 문자 갯수 출력
public class ContinueTest {
	public static void main(String[] args) {
		int count = 0;
		String s = "no news is good news"; // n의 갯수 구하기

		// System.out.println(s.length()); //공백을 포함 20

		for (int i = 0; i < s.length(); i++) { // 문자열의 크기를 구한다

			// System.out.println(s.charAt(i)); //문자를 가져옴
			if (s.charAt(i) != 'n') {
				continue;
			}
			count++;
		}
		System.out.println(count);
	}
}
