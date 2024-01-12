package com.lgy.spring_mvc_board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_mvc_board.command.BCommand;
import com.lgy.spring_mvc_board.command.BContentCommand;
import com.lgy.spring_mvc_board.command.BListCommand;
import com.lgy.spring_mvc_board.command.BWriteCommand;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
	BCommand command;
	
	//게시판 목록 조회
	@RequestMapping("/list")
	public String list(Model model) {
		log.info("@# list");
		
		//service(command)단 호출
//		BListCommand command=new BListCommand();
		command=new BListCommand();
		command.execute(model);
		
		return "list";
	}
	
	@RequestMapping("/write")
//	request : 뷰에서 값을 받아옴
	public String write(HttpServletRequest request, Model model) {
		log.info("@# write");
//		request 에 bname, btitle, bcontent 값들이 있음
		model.addAttribute("request", request);
		command = new BWriteCommand();
//		model 에 request 를 담고 있음
		command.execute(model);
		
//		return "";
		return "redirect:list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# write_view");
		
		return "write_view";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		log.info("@# content_view");
		
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
}













