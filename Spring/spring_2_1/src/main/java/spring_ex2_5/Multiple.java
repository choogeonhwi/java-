package spring_ex2_5;

public class Multiple {
	private int a;
	
	public void p() {
		if (a%3 == 0) {
			System.out.println("3의 배수이다");
		}if (a%5 == 0) {
			System.out.println("5의 배수이다");
			
		}if (a%8 == 0) {
			System.out.println("8의 배수이다");
			
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
