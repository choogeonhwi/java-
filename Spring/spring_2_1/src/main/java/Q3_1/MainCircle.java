package Q3_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_3_2.MyCalculator;

public class MainCircle {
	public static void main(String[] args) {
//		MyCalculator myCalculator=new MyCalculator();
//		myCalculator.setCalculator(new Calculator());
//		//객체를 필드에 세팅
//		
//		
//		myCalculator.setFirstNum(10);
//		myCalculator.setSecondNum(2);
		
		// xml 객체 정보를 읽어 변수에 저장
		String configLoc= "classpath:circleCTX.xml";
		
		//제네릭 클래스로 객체정보 해석(파싱)
		//업캐스팅으로 ctx 참조변수를 받음
		AbstractApplicationContext ctx1 = new GenericXmlApplicationContext(configLoc);
		
		// getBean 메소드로 객체정보 가져옴
		MyCircle myC= ctx1.getBean("mci",MyCircle.class);
		
		myC.p(); //값2개를 들고 -> calculator객체로
		
		
	}
}
