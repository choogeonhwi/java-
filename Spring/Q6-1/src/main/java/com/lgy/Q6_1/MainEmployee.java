package com.lgy.Q6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainEmployee {
	public static void main(String[] args) {
		String configLoc = "classpath:employeeCTX.xml";
		String configLoc2 = "classpath:employeeCTX2.xml";
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc,configLoc2);
				
				// getBean 메소드로 객체정보 가져옴
				Employee e1= ctx.getBean("E",Employee.class);
				
				System.out.println(e1.getN());
				System.out.println(e1.getP());
				System.out.println(e1.getJ());
				System.out.println("==============");
				
				EmplyeeInfo my= ctx.getBean("eii",EmplyeeInfo.class);
				Employee e = my.getEmployee();
				
			
				System.out.println(e.getN());
				System.out.println(e.getP());
				System.out.println(e.getJ());
				System.out.println("==============");
				
				Employee e2= ctx.getBean("ei",Employee.class);
				System.out.println(e2.getN());
				System.out.println(e2.getP());
				System.out.println(e2.getJ());
		
			
				ctx.close();
			}
}
