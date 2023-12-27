package com.lgy.spring14_3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("SC")
	public String sR(HttpServletRequest h) {
		String id = h.getParameter("id");
		
		if (id.equals("abc")) {
			return "sOK";
		}
		return "sNG";
	}
	
	@RequestMapping("sOK")
	public String sOK() {
	
			return "sOK";
	
	}
	@RequestMapping("sNG")
	public String sNG() {
		
		return "sNG";
		
	}
}
