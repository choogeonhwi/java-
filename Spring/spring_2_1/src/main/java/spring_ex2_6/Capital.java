package spring_ex2_6;

public class Capital {
	private char a;
	

	public void p() {
		//StringBuffer를 이용하면 한 번에 출력(jsp 출력시 용이)
		//StringBuffer str = new StringBuffer();
		//c2 = a.charAt(0)
		//str.append(c2)
		//printf(str) = 한 번에 출력
		for (char i = a; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public char getA() {
		return a;
	}

	public void setA(char a) {
		this.a = a;
	}
	
}
