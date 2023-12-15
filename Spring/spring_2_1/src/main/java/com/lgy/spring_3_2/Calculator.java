package com.lgy.spring_3_2;

public class Calculator {
	public void add(int f, int s) {
		System.out.println("addition()");
		int r=f+s;
		System.out.println(f+"+"+s+"="+r);
	}
	public void sub(int f, int s) {
		System.out.println("subtraction()");
		int r=f-s;
		System.out.println(f+"-"+s+"="+r);
	}
	public void mul(int f, int s) {
		System.out.println("multipilcation()");
		int r=f*s;
		System.out.println(f+"*"+s+"="+r);
	}
	public void div(int f, int s) {
		System.out.println("division()");
		int r=f/s;
		System.out.println(f+"/"+s+"="+r);
	}
}
