package com.nabil.NinjaGoldGame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ResetController {

	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("gold");
		return "redirect:/";
	}

}
