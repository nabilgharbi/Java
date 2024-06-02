package com.nabil.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer count = (Integer) session.getAttribute("count");
		count += 1;
		session.setAttribute("count", count);
		return "counter.jsp";
	}

}
