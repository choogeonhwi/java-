package com.lgy.spring_3_1;

public class MainClass {
	public static void main(String[] args) {
		MyCalculator myCalculator=new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		//객체를 필드에 세팅
		
		
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		myCalculator.add(); //값2개를 들고 -> calculator객체로
		myCalculator.sub(); //값2개를 들고 -> calculator객체로
		myCalculator.mul(); //값2개를 들고 -> calculator객체로
		myCalculator.div(); //값2개를 들고 -> calculator객체로
		
	}
}
