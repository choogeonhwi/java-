package com.lgy.spring_mvc_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.ui.Model;

import com.lgy.spring_mvc_board.dao.BDao;

//게시글 저장
public class BWriteCommand  implements BCommand{

	@Override
	public void execute(Model model) {
		//다오에 있는 매개변수 값들이 필요
		// 모델에서 객체 꺼내서 전송
		
		
		Map<String, Object> map = model.asMap();
		
		
		//컨트롤러단에서 보내주는 이름
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		
		String bname = request.getParameter("bname");
		String btitle =request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BDao dao = new BDao();
		dao.write(bname,btitle,bcontent);
	}
	
}
