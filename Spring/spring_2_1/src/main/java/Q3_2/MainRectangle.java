package Q3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import Q3_1.MyCircle;

public class MainRectangle {
	public static void main(String[] args) {
		
String configLoc= "classpath:rectangleCTX.xml";
		
		//제네릭 클래스로 객체정보 해석(파싱)
		//업캐스팅으로 ctx 참조변수를 받음
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		// getBean 메소드로 객체정보 가져옴
		MyRectangle my= ctx.getBean("my",MyRectangle.class);
		
		my.p2(); //값2개를 들고 -> calculator객체로
		
	}
}
