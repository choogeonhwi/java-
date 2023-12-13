package spring_ex2_5;

public class MultipleTriangle {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		Triangle t = new Triangle();
		
		m.setA(240);
		t.setA(4);
		t.setB(3);
		t.setC(5);
		
		m.p();
		t.p();
	}
}
