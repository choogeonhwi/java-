package com.lgy.spring_mvc_board_jdbc.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_mvc_board_jdbc.dao.*;
import com.lgy.spring_mvc_board_jdbc.dto.*;

public class BContentService implements BService{

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bid = request.getParameter("bid");
		
		BDao dao=new BDao();
//		게시글 하나의 내용을 BDto 객체로 받음(bid(글번호) 를 넘겨서 select 쿼리 처리)
		BDto dto = dao.contentView(bid);
//		dto 객체를 모델에 추가(뷰에서 꺼내 사용할수 있음)
		model.addAttribute("content_view", dto);
	}

}
