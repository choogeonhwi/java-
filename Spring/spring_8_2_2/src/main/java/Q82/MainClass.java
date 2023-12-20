package Q82;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX2.xml");
		DbConnection c = ctx.getBean("dbConnection",DbConnection.class);
		System.out.println("mssqlID :"+c.getMssqlId());
		System.out.println("mssqlPW :"+c.getMssqlPw());
		System.out.println("mysqlID :"+c.getMysqlId());
		System.out.println("mysqlPW :"+c.getMysqlPw());
	}
}
