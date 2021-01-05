package com.deepika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/home")
	public String homepage() {
		return "/WEB-INF/views/landing.jsp";
	}
	
	@RequestMapping("/second")
	public String secondpg() {
		return "/WEB-INF/views/page2.jsp";
	}
}
