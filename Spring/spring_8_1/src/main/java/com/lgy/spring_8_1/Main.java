package com.lgy.spring_8_1;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources ps = env.getPropertySources();
		
		try {
			//리소스 타입의 객체를 이용해 외부파일 정보를 가져와 ps에 추가
			ps.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(env.getRequiredProperty("admin.id"));
			System.out.println(env.getRequiredProperty("admin.pw"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		//다운 캐스팅
		GenericXmlApplicationContext gctx = (GenericXmlApplicationContext) ctx;
		gctx.load("appCTX.xml");
		
		gctx.refresh();
		
	adminConnection	ac =gctx.getBean("adminConnection",adminConnection.class);
	System.out.println(ac.getA1());
	System.out.println(ac.getA2());
	}
}
