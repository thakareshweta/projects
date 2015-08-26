package org.shweta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/greeting")//Requestmapping maps to the name of the page which will call this Controller and this method.
	public String sayHello(Model model)
	{
		model.addAttribute("greeting","Hello Shweta!!");
		return "hello";// this is the name of the jsp hello.jsp 
	}
}
