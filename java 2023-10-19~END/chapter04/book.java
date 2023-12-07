package chapter04;

public class book {
	String t;
	String a;

	public book(String ti, String au) {
		t = ti;
		a = au;
	}

	public book(String ti) {
		t = ti; // "춘향전"을 받음
		a = "작자미상";
	}

	public static void main(String[] args) {
//      new book(); // 자동 생성자 정의 실패, 파라미터가 존재하는 생성자를 먼저 만들었기때문에
		book lp = new book("어린왕자", "생텍쥐베리");
		book ls = new book("춘향전");

		System.out.println(lp.t + "" + lp.a);
		System.out.println(ls.t + "" + ls.a);
	}
}
