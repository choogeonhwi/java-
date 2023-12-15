package com.lgy.spring_5_2;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX2.xml");
		Pencil6BWithEraser p11 = ctx.getBean("pencil1", Pencil6BWithEraser.class);
		p11.use();
		Pencil6B p22 = ctx.getBean("pencil2", Pencil6B.class);
		p22.use();
		Pencil4B p33= ctx.getBean("pencil3", Pencil4B.class);
		p33.use();
		
		//인터페이스로
		Pencil p1 =  ctx.getBean("pencil1", Pencil.class);
		//오버라이딩 메소드 호출
		p1.use();
		Pencil p2 =  ctx.getBean("pencil2", Pencil.class);
		//오버라이딩 메소드 호출
		p2.use();
		Pencil p3 =  ctx.getBean("pencil3", Pencil.class);
		//오버라이딩 메소드 호출
		p3.use();
	}
}
