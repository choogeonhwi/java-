package spring_ex2_3;

public class DivAndRemains {
 private int b;

 public void db() {
	 // ex2) int ten=b/10
	 //  int one=b%10
	 // ten==one
	 	if (b==11 || b==22 || b== 33 || b==44 ||b== 55||b== 66||b== 77||b== 88) {
		System.out.println("10의 자리와 1의 자리가 같습니다");
	}else {
		System.out.println("10의 자리와 1의 자리가 다릅니다");
		
	}
 }
 
public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}
 
}
