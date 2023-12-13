package spring_ex2_4;

public class Rectangle {

	 private int c;
	 private int d;
	 
	 public void p() {
		 if ((c>=100&&d>=100)&&(c<=200&&d<=200)) {
			System.out.println(c+","+d+"는 사각형 안에 있습니다");
		}else {
			System.out.println(c+","+d+"는 사각형 안에 없습니다");
			
		}
	 }
	 
	 
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
}
