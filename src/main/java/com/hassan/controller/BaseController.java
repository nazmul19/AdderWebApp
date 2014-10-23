package com.hassan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hassan.service.AddService;

@Controller
@RequestMapping("/")
public class BaseController {

	@Autowired
	private AddService addSrv;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		model.addAttribute("message",
				"Maven Web Project + Spring 3 MVC - welcome()");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";

	}

	@RequestMapping(value = "/welcome/addition", method = RequestMethod.GET)
	public String welcomeName(ModelMap model) {

		model.addAttribute("message", " Addition of 10, 20 is:"
				+ addSrv.doAddition(10, 20));
		return "index";

	}

}