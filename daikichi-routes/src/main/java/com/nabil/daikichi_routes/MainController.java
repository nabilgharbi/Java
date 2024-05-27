package com.nabil.daikichi_routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/daikichi")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/daikichi/today")
	public String today() {
		return "today.jsp";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "tomorrow.jsp";
	}
}
