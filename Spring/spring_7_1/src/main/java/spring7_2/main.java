package spring7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class main {
	public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    
    //스프링 설정
    ctx.load("classpath:appCTX2.xml");
  
    ctx.refresh();

    
    
    ctx.close();
	}
}
