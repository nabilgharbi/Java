package com.nabil.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nabil.dojosandninjas.models.Dojo;
import com.nabil.dojosandninjas.models.Ninja;
import com.nabil.dojosandninjas.services.DojoService;
import com.nabil.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninServ;
	
	@Autowired
	private DojoService dojoServ;
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model)
	{
		List<Dojo> allDojos = dojoServ.allDojos();
		model.addAttribute("allDojos", allDojos);
		
		return "NewNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result)
	{
		if (result.hasErrors())
		{
			return "NewNinja.jsp";
		}
		else
		{
			ninServ.createNinja(ninja);
			return "redirect:/dojos";
		}
	}
}
