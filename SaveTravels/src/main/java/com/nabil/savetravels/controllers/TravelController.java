package com.nabil.savetravels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.nabil.savetravels.models.Travel;
import com.nabil.savetravels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	@Autowired
	TravelService travelService;
	
//	---- SHOW ALL ----
	@GetMapping("/expenses")
	public String allTravels(Model model) {
		model.addAttribute("allTravels", travelService.allTravels());
		model.addAttribute("travel", new Travel());
		return "index.jsp";
	}

//	---- CREATE ONE (form) ----
	@PostMapping("/expenses/create")
//	**** @Valid @ModelAtrributes BindingResults - NEED TO BE STRINGED TOGETHER ****
	public String process(@Valid @ModelAttribute("travel")Travel travel, BindingResult bindingResult, Model model){
		if(bindingResult.hasErrors()) {
			model.addAttribute("allTravels", travelService.allTravels());
			return "index.jsp";
		} else {
		travelService.createTravel(travel);
		}
		return "redirect:/expenses";
	}
	
//	---- EDIT ONE (route) ----
	@GetMapping("/expenses/edit/{id}")
	public String editTravel(@PathVariable("id") Long id, Model model) {
		model.addAttribute("travel", travelService.findTravel(id));
		return "edit.jsp";
	}
	
//	---- EDIT ONE (form) ----
	@PutMapping("/expenses/process/edit/{id}")
	public String processEdit(@Valid @ModelAttribute("travel")Travel travel, BindingResult result, @PathVariable("id")Long id) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		travelService.updateTravel(travel);
		return "redirect:/expenses";
	}
	
//	---- SHOW ONE ----
	@GetMapping("/expenses/{id}")
	public String oneTravel(Model model, @PathVariable("id") Long id) {
		Travel travel = travelService.findTravel(id);
		model.addAttribute("travel", travel);
		
		return "show.jsp";
	}
	
//	---- DELETE ----
	@DeleteMapping("/expenses/delete/{id}")
	public String deleteTravel(@PathVariable("id")Long id) {
		travelService.deleteTravel(id);
		return "redirect:/expenses";
	}
}
