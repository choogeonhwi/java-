package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue=10;
		int intValue=byteValue;
		// 작은 -> 큰 타입으로 자동 변환
		
		
		
		System.out.println("intValue : "+intValue);
		
		
		
	char charValue='가';
	intValue = charValue;
	// 변수에 유니코드 저장
	System.out.println("intValue : "+intValue);
	
	intValue=50;
	long longValue = intValue;
	//자동변환 작은 > 큰
	System.out.println("longValue : "+longValue);
	
	longValue=100;
	float floatValue = longValue;
	//정수 > 실수(실수의 범위가 크기 때문에 long보다 우세)
	System.out.println("floatValue : "+floatValue);
	
	floatValue=(float)100.5;//100.5f와 같다
	double doubleValue = floatValue;
	System.out.println("doubleValue : "+doubleValue);
	
	
	
	
	
	
	
	
	
	}
}
