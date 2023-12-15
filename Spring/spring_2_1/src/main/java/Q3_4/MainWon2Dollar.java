package Q3_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import Q3_3.MySeason;

public class MainWon2Dollar {
public static void main(String[] args) {
		
		String configLoc= "classpath:won2DollarCTX.xml";
				
				//제네릭 클래스로 객체정보 해석(파싱)
				//업캐스팅으로 ctx 참조변수를 받음
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
				
				// getBean 메소드로 객체정보 가져옴
				MyWon2Dollar my= ctx.getBean("my",MyWon2Dollar.class);
				
				my.p2(); 
				
			}
}
