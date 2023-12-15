package com.lgy.spring_4_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Main {
	public static void main(String[] args) {
		String configLoc = "classpath:myInfoCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		// getBean 메소드로 객체정보 가져옴
		MyInfo my= ctx.getBean("myInfo",MyInfo.class);
		
		my.getInfo(); 
		
		//메모리 반납
		ctx.close();
	}
}
