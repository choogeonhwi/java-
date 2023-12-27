package com.lgy.spring7_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class main {
	public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    
    //스프링 설정
    ctx.load("classpath:appCTX.xml");
    //새로고침 (설정반영) ,객체 출력에는 영향 없음
    ctx.refresh();

    
    student s = ctx.getBean("student1", student.class);
    
    System.out.println("이름 :"+s.getName());
    System.out.println("나이 :"+s.getAge());
    
    ctx.close();
	}
}