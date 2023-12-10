package question09;

import java.util.ArrayList;
import java.util.Scanner;

class QWER1 {
	Scanner s = new Scanner(System.in);

	public void Q() {
		System.out.printf("====헬스클럽 회원관리 프로그램 ==== \n");
	}

	public void QW() {
		System.out.printf("=======================\n");
	}

	public void QWE() {
		System.out.printf("메뉴를 선택하세요. >>>\n");
	}

	public void QWER() {
		System.out.printf("1.회원 정보관리 | 2.프로그램 종료\n");
	}

	public void QWER11() {
		System.out.printf("====일반회원 정보관리====\n");
	}

	public void QWER12() {
		System.out.printf("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회원 정보확인 | 0.이전단계\n");
	}

	public void QWER13() {
		System.out.printf("가입할 회원 수를 입력하세요>>\n");
	}

	public void QWER14() {
		System.out.printf("회원정보를 입력하세요.\n");
	}

	public void QWER15() {
		System.out.printf("회원 아이디 :");
	}

	public void QWER16() {
		System.out.printf("회원 이름 :");
	}

	public void QWER17() {
		System.out.printf("회원 지역 :");
	}

	public void QWER18() {
		System.out.printf("삭제할 회원번호를 입력하세요.");
	}

	public void WER() {

		QWER11();
		QWER12();
		QW();
		QWE();

	}

}

class QWER2 {
	public QWER2(String iD, String name, String area) {
		this.c = iD;
		this.d = name;
		this.e = area;
	}

	public QWER2() {

	}

	private String c;
	private String d;
	private String e;

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}
}

public class QWER1234 {
	public static void main(String[] args) {
		QWER1 Q = new QWER1();
		Scanner s = new Scanner(System.in);
		ArrayList<QWER2> l = new ArrayList<>();
		int a = 0;

		while (true) {
			Q.Q();
			Q.QWER();
			Q.QW();
			Q.QWE();
			a = s.nextInt();
			if (a == 1) {
				while (true) {
					Q.WER();
					a = s.nextInt();
					if (a == 11) {
						Q.QWER13();
						int b = s.nextInt();
						for (int i = 0; i < b; i++) {
							Q.QWER14();
							Q.QWER15();
							String C = s.next();
							Q.QWER16();
							String D = s.next();
							Q.QWER17();
							String E = s.next();
							l.add(new QWER2(C, D, E));
						}
					}

					else if (a == 22) {
						Q.QWER18();
						int r = s.nextInt();
						l.remove(r - 1);
						for (int i = 0; i < l.size(); i++) {
							QWER2 R2 = l.get(i);

							System.out.println("회원 번호" + (i + 1));
							Q.QWER15();
							System.out.println(R2.getC());
							Q.QWER16();
							System.out.println(R2.getD());
							Q.QWER17();
							System.out.println(R2.getE());
						}
					} else if (a == 33) {
						System.out.println("등록된 회원수는 " + l.size() + "입니다.");
						for (int i = 0; i < l.size(); i++) {
							QWER2 R2 = l.get(i);
							System.out.println("회원 번호" + (i + 1));
							Q.QWER15();
							System.out.println(R2.getC());
							Q.QWER16();
							System.out.println(R2.getD());
							Q.QWER17();
							System.out.println(R2.getE());
						}
					} else if (a == 0) {
						break;
					}
				}
			} else if (a == 2) {
				Q.QW();
				System.out.println("프로그램을 종료합니다.");
				Q.QW();
				break;
			}
		}
		s.close();
	}
}
