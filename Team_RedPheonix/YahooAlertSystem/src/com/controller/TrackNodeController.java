package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrackNodeController {
	
	/*
	 * This method will use to set alert if
	 * in case any one wants to track the node
	 * and all the activity
	 */
	@RequestMapping(value = "*.do", method = RequestMethod.GET)
	public ModelAndView trackPropertyNode() {
		
		// SMS Gateway
		// EMail Gateway
		
		return new ModelAndView();
	}

}
