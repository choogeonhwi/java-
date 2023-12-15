package Q3_6;

public class DivAndRemains {
	public void p(int p1) {
		int ten=p1/10;
		int one=p1%10;
		
		if (ten==one) {
			System.out.println("입력된 수?");
			System.out.println(p1+"는 10의자리와 1의자리가 같습니다");
		}else {
			System.out.println("입력된 수?");
			System.out.println(p1+"는 자리가 다릅니다");
		}
			
		}
}
