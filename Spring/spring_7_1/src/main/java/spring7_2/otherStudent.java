package spring7_2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class otherStudent {
	
		private String name;
		private int age;
		
			
		
		@PostConstruct
		
		public void initMethod() {
			System.out.println("initMethod");
		}
		
		@PreDestroy
		public void destroyMethod() {
			System.out.println("destroyMethod");
		}
		
		public otherStudent(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

}
