package com.lgy.spring_8_1;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import java.lang.Exception;


public class adminConnection  implements InitializingBean, EnvironmentAware{
	private Environment env; // 환경객체로 시스템 설정 값 저장
	private String a1;
	private String a2;
	
	@Override
	public void setEnvironment(Environment environment){
		System.out.println("setEnvironment");
		setEnv(environment); //환경객체를 env 객체에 저장
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
		setA1(env.getProperty("admin.id")); //소스 파일에서 어드민 아이디를 가져옴
		setA2(env.getProperty("admin.pw")); //소스 파일에서 어드민 비번을 가져옴
	}
	
	
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	
}
