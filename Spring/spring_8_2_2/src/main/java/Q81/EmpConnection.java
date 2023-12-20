package Q81;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EmpConnection  implements InitializingBean, EnvironmentAware {
	private Environment env;
	private String empId;
	private String empPw;
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPw() {
		return empPw;
	}

	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}

	@Override
	public void setEnvironment(Environment environment) {
		setEnv(environment); //환경객체를 env 객체에 저장
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		setEmpId(env.getProperty("emp.id")); //소스 파일에서 어드민 아이디를 가져옴
		setEmpPw(env.getProperty("emp.pw")); //
		
	}

}
