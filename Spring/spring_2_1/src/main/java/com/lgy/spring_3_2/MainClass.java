package com.lgy.spring_3_2;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		MyCalculator myCalculator=new MyCalculator();
//		myCalculator.setCalculator(new Calculator());
//		//객체를 필드에 세팅
//		
//		
//		myCalculator.setFirstNum(10);
//		myCalculator.setSecondNum(2);
		
		// xml 객체 정보를 읽어 변수에 저장
		String configLoc= "classpath:applicationCTX.xml";
		
		//제네릭 클래스로 객체정보 해석(파싱)
		//업캐스팅으로 ctx 참조변수를 받음
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		// getBean 메소드로 객체정보 가져옴
//		MyCalculator myCalculator= ctx.getBean("myCalculator",MyCalculator.class);
		MyCalculator myCalculator2= ctx.getBean("myCalculator2",MyCalculator.class);
		
		myCalculator2.add(); //값2개를 들고 -> calculator객체로
		myCalculator2.sub(); //값2개를 들고 -> calculator객체로
		myCalculator2.mul(); //값2개를 들고 -> calculator객체로
		myCalculator2.div(); //값2개를 들고 -> calculator객체로
		
	}
}
