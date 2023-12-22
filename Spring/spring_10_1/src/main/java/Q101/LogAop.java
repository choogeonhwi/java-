package Q101;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//공통 기능
@Aspect
public class LogAop {
	
	//공통 기능 적용 범위
	@Pointcut("within(Q101.*)")
	private void pointCutMethod() {
		
	}
	
//	loggerAop: advice
	//메소드 전 후 예외처리 포함해서 공통기능 실행
	@Around("pointCutMethod()") //적용되는 메소드 명 설정
	public Object LoggerAop(ProceedingJoinPoint joinPoint) {
		String sig = joinPoint.getSignature().toShortString();// 핵심기능 정보 가져옴
		System.out.println("@@@### start===>"+sig); // 핵심기능 시작부분
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
			System.out.println("@@@### end===>"+sig);
		
			
		}
		return ob; //핵심기능 반환
	}

}
