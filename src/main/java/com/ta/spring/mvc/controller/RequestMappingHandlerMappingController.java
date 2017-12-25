package com.ta.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requestmappinghandlermapping")
public class RequestMappingHandlerMappingController {

	@RequestMapping("/message")
	public String requestMappingHandlerMapping(Model model){
		String message = "Hello RequestMappingHandlerMapping";
		model.addAttribute("rmhm", message);
		return "rmhm";
	}
}
