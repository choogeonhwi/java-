package chapter06;

public class stringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");

		System.out.println(a.length()); // 문자열 길이
		System.out.println(a.contains("#")); // 참
		System.out.println(a.contains("*")); // 거짓

		a = a.concat(b); // 문자열 연결
		System.out.println(a); // 새로운 문자열을 a가 가리킴

		a = a.trim(); // 공백제거
		System.out.println(a);

		a = a.replace("C#", "Java"); // 문자열 대체
		System.out.println(a);

		String s[] = a.split(",");

		for (int i = 0; i < s.length; i++) {
			System.out.println("분리 문자열" + i + ":" + s[i]);
		}

		a = a.substring(5); // 인덱스값으로 시작하는 문자열
		System.out.println(a);

		char c = a.charAt(2); // 인덱스에 해당하는 문자
		System.out.println(c);
	}
}
