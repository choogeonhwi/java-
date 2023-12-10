package chapter04;

public class Circle2 {
	int r;
	String n;

	public double g() {
		return 3.14 * r * r;
	}

	public Circle2() {
		r = 1;
		n = "";
	}

	public Circle2(int ra, String na) {
		r = ra;
		n = na;

	}

//	public Circle2(int r, String n) {
//		this.r=r;
//		this.n=n;
//		//명확한 정의를 지시
//	}
	public static void main(String[] args) {
//   Circle2 pizza= new Circle2(); // 참조
//   	// 호출 - 생성자 - 값 세팅 - 필드 세팅
//  double area =  pizza.g();
//   System.out.println(area);	

//	Circle2 pizza= new Circle2(10); //매개변수의 부재
		Circle2 pizza = new Circle2(10, "피자");
		double area = pizza.g();
		System.out.println(pizza.n + "면적" + area);

		Circle2 d = new Circle2();
		d.n = "도넛";
		area = d.g();
		System.out.println(d.n + "면적" + area);
	}
}
