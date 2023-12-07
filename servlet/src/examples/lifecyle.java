package examples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lifecyle
 */
@WebServlet("/lifecyle")
public class lifecyle extends HttpServlet {
	int initC = 1;
	int serviceC = 1;
	int destroyC = 1;

	// 첫 실행 1회 호출
	@Override
	public void init() throws ServletException {
		System.out.println("init 메소드가 첫 요청만 호출 :" + initC++);

	}

	@Override
	public void destroy() {
		System.out.println("destory 메소드는 톰캣 종료될때만 호출 :" + destroyC++);
	}

	// doget의 호출 제한
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service 메소드는 요청시 호출 :" + serviceC++);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
