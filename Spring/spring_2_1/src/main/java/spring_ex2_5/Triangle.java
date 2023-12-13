package spring_ex2_5;

public class Triangle {
	private int a;
	private int b;
	private int c;
	
	public void p() {
		if (a+b>c) {
			System.out.println("삼각형이 됩니다");
		}else if (b+c>a) {
			System.out.println("삼각형이 됩니다");
		}else	if (c+a>b) {
			System.out.println("삼각형이 됩니다");
		}else {
			System.out.println("삼각형이 안 됩니다.");
		}
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
}
