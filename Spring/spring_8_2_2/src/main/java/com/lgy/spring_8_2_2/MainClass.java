package com.lgy.spring_8_2_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");
//		스프링 자바 설정파일 사용
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println("@# getAdminId ===>" + connection.getAdminId());
		System.out.println("@# getAdminPw ===>" + connection.getAdminPw());
		System.out.println("@# getSub_adminId ===>" + connection.getSub_adminId());
		System.out.println("@# getSub_adminPw ===>" + connection.getSub_adminPw());
	}
}
