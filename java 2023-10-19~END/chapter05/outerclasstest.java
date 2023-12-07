package chapter05;

class oc {
	private String secret = "TIME IS MONEY";

	public oc() {
		ic obj = new ic();
		obj.m();
	}

	public class ic {
		// 내부 클래스, 중첩
		public ic() {
			System.out.println("내부 클래스 생성자");

		}

		public void m() {
			System.out.println(secret);
		}
	}
}

public class outerclasstest {
	public static void main(String[] args) {
//		new oc();//객체생성
//		new ic(); 접근제한 
		oc outer = new oc(); // private면 접근제한
//		outer.secret; 어떤 조건에서도 접근제한
	}
}
