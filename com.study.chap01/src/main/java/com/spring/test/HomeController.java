package com.spring.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	public HomeController(){
		}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	protected HomeService homeService;
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String home(Map modelMap, Command command) {
		return "home";
	}
	
	@RequestMapping(value = "/{group}/{type}/list.do", method = RequestMethod.GET)
	public String list(@PathVariable String group, @PathVariable String type,Map modelMap , Command command){

		command.setGroup(group);
		command.setType(type);
		homeService.list(modelMap, command);
		return group+"/"+type+"/list";
	}
 
}
