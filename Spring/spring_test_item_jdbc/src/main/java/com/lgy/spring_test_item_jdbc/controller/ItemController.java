package com.lgy.spring_test_item_jdbc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_test_item_jdbc.util.*;
import com.lgy.spring_test_item_jdbc.service.*;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	ItemService service;
	public JdbcTemplate template;
	
//	servlet-context.xml 에 있는 template 객체를 저장(this.template)
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
//		Constant.template 를 dao 에서 사용
		Constant.template = this.template;
	}
	
	@RequestMapping("/write")
	public String write_view() {
		log.info("@# write");
		
		return "itemWrite";
	}
	
	@RequestMapping("/writeResult")
	public String writeResult(HttpServletRequest request, Model model) {
		log.info("@# writeResult");
		model.addAttribute("request", request);
		service = new ItemWriteService();
		service.execute(model);
		
		return "writeResult";
	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view");
		
		service=new ItemContentService();
		service.execute(model);
		
		return "content_view";
	}
}










