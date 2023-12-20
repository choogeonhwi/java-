package com.lgy.spring_6_5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainNasdaq {
	public static void main(String[] args) {
String configLoc = "classpath:nasdaqCTX.xml";
String configLoc2 = "classpath:nasdaqCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc,configLoc2);
		
		// getBean 메소드로 객체정보 가져옴
		Nasdaq n1= ctx.getBean("n",Nasdaq.class);
	
		System.out.println(n1.getA());
		System.out.println(n1.getR());
		System.out.println(n1.getS());
		
		NasdaqInfo my= ctx.getBean("ni",NasdaqInfo.class);
		Nasdaq n2 = my.getNasdaq();
		
	
		System.out.println(n2.getA());
		System.out.println(n2.getR());
		System.out.println(n2.getS());
		
		Nasdaq n3= ctx.getBean("n2",Nasdaq.class);
		System.out.println(n3.getA());
		System.out.println(n3.getR());
		System.out.println(n3.getS());
	
		ctx.close();
	}
}
