package spring_ex2_6;

public class Asterisk {
	private int a;

	public void p() {
		//StringBuffer를 이용하면 한 번에 출력(jsp출력시 용이)
		for (int i = a; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
