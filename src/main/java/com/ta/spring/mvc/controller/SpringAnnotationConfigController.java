package com.ta.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringAnnotationConfigController {

	@RequestMapping(path="/greet/{name}", method=RequestMethod.GET)
	public String greetHello(@PathVariable String name, ModelMap modelMap) {

		String hello = "Hello " + name + " how are you?";
		modelMap.addAttribute("greet", hello);
		return "greet";
	}

}
