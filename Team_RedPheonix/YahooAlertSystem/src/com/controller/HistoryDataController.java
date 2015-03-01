package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HistoryDataController {

	/*
	 * Below method will be used to query data from the resolution
	 * log in order to visualize the result and action taken by
	 * self healing system Chef
	 */
	@RequestMapping(value = "*.do", method = RequestMethod.GET)
	public ModelAndView searchHistroyData() {
		
		// Connection to Database
		
		return new ModelAndView();
	}
}
