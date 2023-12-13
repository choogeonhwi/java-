package com.lgy.spring_2_1;

public class MainClass {
	public static void main(String[] args) {
		Calculation c = new Calculation();//의존성
		c.setFirstNum(10);
		c.setSecondNum(2); //객체로 주입 (Dependency Injection)
		
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}
