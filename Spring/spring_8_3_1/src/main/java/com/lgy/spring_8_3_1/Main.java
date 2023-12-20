package com.lgy.spring_8_3_1;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String config = "";
		Scanner s = new Scanner(System.in);
		String str = s.next();

		if (str.equals("dev")) {
			config = "dev";

		} else if (str.equals("run")) {
			config = "run";
		}

		s.close();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); // dev or run

		ctx.load("appCTX_dev.xml", "appCTX_run.xml");// 값을 가지고 프로파일 속성을 찾아감
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println(info.getIpNum());
		System.out.println(info.getPortNum());
		
	}
}
