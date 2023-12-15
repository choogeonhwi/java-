package com.lgy.spring_5_1;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_4_1.MyInfo;

public class Main {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX1.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		// getBean 메소드로 객체정보 가져옴
		StudentInfo my= ctx.getBean("studentInfo",StudentInfo.class);
		
		my.getStudentInfo(); 
		
		
		Student student2= ctx.getBean("student2",Student.class);
		
		my.setStudent(student2);
		
		
		my.getStudentInfo(); 

		ctx.close();
	}
}
