package com.nabil.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nabil.dojosandninjas.models.Dojo;
import com.nabil.dojosandninjas.services.DojoService;
import com.nabil.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoController 
{
	
	@Autowired
	private DojoService dojoServ;
	
	@Autowired
	private NinjaService ninServ;
	
	@GetMapping("/")
	public String redirectMe()
	{
		return "redirect:/dojos";
	}
	
	@GetMapping("/dojos")
	public String dojos(@ModelAttribute("dojo") Dojo dojo, Model model) 
	{
		// fetch all dojos
		List<Dojo> allDojos = dojoServ.allDojos();
		model.addAttribute("allDojos", allDojos);
	
		return "dojos.jsp";
	}
	
	@PostMapping("/dojos")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result)
	{
		if (result.hasErrors()) 
		{
			return "dojos.jsp";
		}
		else
		{
			dojoServ.createDojo(dojo);
			return "redirect:/dojos";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String singleDojo(@PathVariable("id") Long id, Model model)
	{
		Dojo thisDojo = dojoServ.findDojo(id);
		model.addAttribute("thisDojo", thisDojo);
		return "DojoLocations.jsp";
	}

}
