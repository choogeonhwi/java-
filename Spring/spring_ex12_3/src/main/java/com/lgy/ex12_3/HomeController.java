package com.lgy.ex12_3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	
	

		@RequestMapping("bbb/airbnb")
		public String view(Model model) {
			model.addAttribute("id", "숙소예약");
			
			return "bbb/airbnb";
		}
		
		@RequestMapping("bbb/universityManager")
		public String view2(Model model2) {
			model2.addAttribute("id2", "학사관리");
			return "bbb/universityManager";
		}
		
		@RequestMapping("bbb/bookManager")
		public String view3(Model model3) {
			model3.addAttribute("id3", "도서관리");
			return "bbb/bookManager";
		}
		
	}
	
