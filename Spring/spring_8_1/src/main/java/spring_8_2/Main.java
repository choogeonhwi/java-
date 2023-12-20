package spring_8_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("appCTX2.xml");
		adminConnection c = ctx.getBean("adminConnection", adminConnection.class);
		System.out.println(c.getA1());
		System.out.println(c.getA2());
		System.out.println(c.getSub_a1());
		System.out.println(c.getSub_a2());
	}
}
