package Q83;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		String config = "";
		Scanner s = new Scanner(System.in);
		String str = s.next();

		if (str.equals("oracle")) {
			config = "oracle";

		} else if (str.equals("mysql")) {
			config = "mysql";
		}

		s.close();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); // dev or run

		ctx.load("oracleCTX.xml", "mysqlCTX.xml");// 값을 가지고 프로파일 속성을 찾아감
		DbInfo info = ctx.getBean("dbInfo", DbInfo.class);
		System.out.println("driver:"+info.getDriver());
		System.out.println("url:"+info.getUrl());
		System.out.println("user:"+info.getUser());
		System.out.println("pwd:"+info.getPassword());
		
	}
}
