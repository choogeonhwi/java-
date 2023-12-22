package com.lgy.spring_10_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {	
		public static void main(String[] args) {
			AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
			Student student = ctx.getBean("student", Student.class);
			student.getStudentInfo();
			
			Worker w = ctx.getBean("worker", Worker.class);
			
			w.getWorkerInfo();
			
			
		}
}
