package com.lgy.spring13_3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
//	@RequestMapping("member/join")
//	public String joinData(@RequestParam("name") String name
//			,@RequestParam("id") String id
//			,@RequestParam("pw") String pw
//			,@RequestParam("email") String email
//			,Model m){
//		Member m2 = new Member();
//		
//		m2.setName(name);
//		m2.setId(id);
//		m2.setPw(pw);
//		m2.setEmail(email);
//		
//		
//		m.addAttribute("member", m2);
//		return "member/join";
//	}
//	
	
	@RequestMapping("member/join")
	public String joinData(Member member){

		return "member/join";
	}
	
}
