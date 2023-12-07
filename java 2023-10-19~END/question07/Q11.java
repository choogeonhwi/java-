package question07;

public class Q11 {
	public static void main(String[] args) {

		S s1 = new S("갑돌", 100, "컴퓨터공학과");
		System.out.println("이름:" + s1.gn());
		System.out.println("학번:" + s1.gn2());
		System.out.println("학과:" + s1.gd());
		S s2 = new S("갑순", 200, "건축학과");
		System.out.println("이름:" + s2.gn());
		System.out.println("학번:" + s2.gn2());
		System.out.println("학:" + s2.gd());
		s2.to(args);
		;
	}
}

class S {
	String n;
	int N;
	String d;

	public S(String a, int b, String c) {
		n = a;
		N = b;
		d = c;

	}

	String gn() {
		return n;
	}

	int gn2() {
		return N;
	}

	String gd() {
		return d;
	}

	String sn() {
		return "갑순";

	}

	String sn2() {
		return "200";

	}

	String gd2() {
		return "수학과";

	}

	void to(String[] args) {
		System.out.println("이름:" + gn() + "\n" + "학번:" + gn2() + "\n" + "소속학과:" + gd2() + "\n");
	}

}
