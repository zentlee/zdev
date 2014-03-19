package com.app.myapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.myapp.dao.UserDaoImpl;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource(name="userDaoImpl")
	private UserDaoImpl userDaoImpl;
	
	@RequestMapping("/user.do")
	public ModelAndView getUser(){
		logger.info("user.do");
		ModelAndView mav = new ModelAndView("user");
		mav.setViewName("user");
		Map<String, String> map = new HashMap<String, String>();
		int i = userDaoImpl.getLoginResult(map);
		logger.info("count : " +String.valueOf(i));
		return mav;
	}
}
