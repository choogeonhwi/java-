package Q6_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainSinger {
	public static void main(String[] args) {
		String configLoc = "classpath:singerCTX.xml";
		String configLoc2 = "classpath:singerCTX2.xml";
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc,configLoc2);
				
				// getBean 메소드로 객체정보 가져옴
				Singer s= ctx.getBean("s",Singer.class);
				
				System.out.println(s.getN());
				System.out.println(s.getM());
				System.out.println(s.getS());
				System.out.println("==============");
				
				SingerInfo my= ctx.getBean("si",SingerInfo.class);
				Singer si = my.getSinger();
				
			
				System.out.println(si.getN());
				System.out.println(si.getM());
				System.out.println(si.getS());
				System.out.println("==============");
				
				Singer s2= ctx.getBean("s2",Singer.class);
				System.out.println(s2.getN());
				System.out.println(s2.getM());
				System.out.println(s2.getS());
		
			
				ctx.close();
			}
}
