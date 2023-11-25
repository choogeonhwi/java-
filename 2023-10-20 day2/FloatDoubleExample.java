package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//float var1=3.14; //실수기본=더블, 오류
		//float var1=3.14f;
		float var1=3.14F;
		double var2=3.14;
		
		//double>float 자리올림수
		float var3=0.1234567890F;// 소수점 자리수 제한 없이 값을 가지나 출력시 반올림
		float var4=0.12345678901234567890F;
		double var5=0.12345678901234567890; // 자리올림
		double var6=0.12345678901234567890123456789001234567890F;
		double var7=3e6;
		float var8=3e6f;
		float var9=3e-3f;
		double var10=3e-3;
		
		System.out.println("var1 : "+var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);
	}

}
