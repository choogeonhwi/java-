package spring_ex2_2;

public class Season {
	private int a;

	
	public void s() {
		if (a==3 || a==4 || a==5 ) {
			System.out.println("봄");
			
		}
		if (a==6 || a==7 || a==8 ) {
			System.out.println("여름");
			
		}
		if (a==9 || a==10 || a==11 ) {
			System.out.println("가을");
			
		}
		if (a==12 || a==1 || a==2 ) {
			System.out.println("겨울");
			
		}
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	
}
