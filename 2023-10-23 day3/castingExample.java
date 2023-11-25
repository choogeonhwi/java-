package chapter02;

public class castingExample {
 public static void main(String[] args) {
	 int intValue=44032;
	//char charValue =intValue;
	 // 정수 > 문자 오류
	char charValue = (char)intValue;
	 
	 System.out.println(charValue);

	 
	 
	 
	 //long longValue = 500;// 작은 > 큰 변환
	 long longValue = 5000999888L;// int > long (첫 지정시는 캐스팅 불가능)
	 intValue = (int)longValue;//부족한 범위는 짤림(706032592)
	 System.out.println(intValue);
	 
	 
	 
	 double doubleValue=3.14;
	 intValue =(int)doubleValue;
	 System.out.println(intValue);
	 
	 
	 
 
 }
}
