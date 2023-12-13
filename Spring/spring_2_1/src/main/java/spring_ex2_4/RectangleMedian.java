package spring_ex2_4;

public class RectangleMedian {
	public static void main(String[] args) {
		Median m = new Median();
		Rectangle r = new Rectangle();
		
		r.setC(150);
		r.setD(150);
		
		m.setA(20);
		m.setB(100);
		m.setC(33);
		
		r.p();
		m.p();
	}
}
