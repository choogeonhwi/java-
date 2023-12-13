package spring_ex2_1;

public class Circle {
	private double r;

	public void a() {
		System.out.println(r*r*Math.PI);
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}
