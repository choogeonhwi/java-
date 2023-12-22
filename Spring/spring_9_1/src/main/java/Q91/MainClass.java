package Q91;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_9_1.Student;
import com.lgy.spring_9_1.Worker;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX2.xml");
		Professor p = ctx.getBean("professor", Professor.class);
		p.getProfessorInfo();
		
		Singer s = ctx.getBean("singer", Singer.class);
		
		s.getSingerInfo();
		
		
	}
}
