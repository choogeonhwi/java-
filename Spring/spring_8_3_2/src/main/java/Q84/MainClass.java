package Q84;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		
	
	ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
	ConfigurableEnvironment env = ctx.getEnvironment();
	MutablePropertySources ps = env.getPropertySources();
	
	try {
		//리소스 타입의 객체를 이용해 외부파일 정보를 가져와 ps에 추가
		ps.addLast(new ResourcePropertySource("classpath:jdbc.driver"));
		System.out.println(env.getRequiredProperty("oracle"));
		System.out.println(env.getRequiredProperty("mysql"));
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	//다운 캐스팅
	GenericXmlApplicationContext gctx = (GenericXmlApplicationContext) ctx;
	gctx.load("applicationCTX.xml");
	
	gctx.refresh();
	
	JdbcDriver	ac =gctx.getBean("jdbcDriver",JdbcDriver.class);
System.out.println("OracleJdbcDriver :"+ac.getOracleJdbcDriver());
System.out.println("MySqlJdbcDriver  :"+ac.getMysqlJdbcDriver());
	}
}
