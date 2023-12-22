package com.lgy.spring_9_1;



import org.aspectj.lang.ProceedingJoinPoint;

//공통 기능
public class LogAop {
//	loggerAop: advice
	public Object LoggerAop(ProceedingJoinPoint joinPoint) {
		String sig = joinPoint.getSignature().toShortString();// 핵심기능 정보 가져옴
		System.out.println(sig + "is start."); // 핵심기능 시작부분
		long st = System.currentTimeMillis();
		Object ob=null;
		
		
		//핵심 기능 실행
		try {
			ob =  joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//기능 종료
			long end = System.currentTimeMillis();
			System.out.println(sig+"is finished");
			System.out.println(sig+"의 경과시간 : "+(end-st));
			
		}
		return ob; //핵심기능 반환
	}

}
