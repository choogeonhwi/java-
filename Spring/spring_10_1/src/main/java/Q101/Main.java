package Q101;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {	
		public static void main(String[] args) {
			AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
			Car student = ctx.getBean("student", Car.class);
			student.getCarInfo();
			
			Graphic w = ctx.getBean("worker", Graphic.class);
			
			w.getGraphicInfo();
			
			
		}
}
