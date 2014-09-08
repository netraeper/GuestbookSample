package com.traeper.guestbookapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.traeper.dao.JDBCGuestBookDAO;
import com.traeper.vo.GuestBookVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	JDBCGuestBookDAO guestBookDAO = new JDBCGuestBookDAO();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("guestbooks", guestBookDAO.retrieve());
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public ModelAndView write(@ModelAttribute GuestBookVO guestBookVO) {
		guestBookDAO.create(guestBookVO);
		return home();
	}	
	
	
}
