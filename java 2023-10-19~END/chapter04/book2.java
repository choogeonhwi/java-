package chapter04;

public class book2 {
	String t;
	String a;

	public book2(String t, String a) {
		System.out.println("생성자1 호출");
		this.t = t;
		this.a = a;
	}

	public book2(String t) {
		this(t, "작자미상"); // this는 첫라인에 없으면 오류
		System.out.println("생성자2 호출");
	}

	public book2() {
		this("", "");
		System.out.println("생성자3 호출");
	}

	void show() {
		System.out.println(t + "" + a);
	}

	public static void main(String[] args) {
		book2 lp = new book2("어린왕자", "생텍쥐베리");
		book2 ls = new book2("춘향전");
		book2 eb = new book2();
//		System.out.println(lp.t+""+lp.a);
		lp.show();
		ls.show();
		eb.show();

	}
}
