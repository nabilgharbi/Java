package com.nabil.savetravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nabil.savetravels.models.Travel;
import com.nabil.savetravels.services.TravelService;

@RestController
public class TravelsApi {

 private final TravelService travelService;
 public TravelsApi(TravelService travelService){
     this.travelService = travelService;
 }

 @RequestMapping("/api/expenses")
 public List<Travel> index() {
     return travelService.allTravels();
 }
 
// ---- CREATE ----
 @PostMapping("/api/expenses")
 public Travel createOne(@RequestParam("name") String name, @RequestParam("vendor") String vendor, @RequestParam("amount") Double amount, @RequestParam("description") String description) {
     Travel travel = new Travel(name, vendor, amount, description);
     return travelService.createTravel(travel);
 }
 
// ---- SHOW ----
 @GetMapping("/api/expenses/{id}")
 public Travel showOne(@PathVariable("id") Long id) {
     Travel travel = travelService.findTravel(id);
     return travel;
 }
 
// ---- EDIT ONE ----
 @PutMapping("/api/expenses/{id}")
 public Travel updateOne(
 		@PathVariable("id") Long id, 
 		@RequestParam("name") String name, 
 		@RequestParam("vendor") String vendor, 
 		@RequestParam("amount") Double amount,
 		@RequestParam("description") String description) {
     Travel travel = new Travel(name, vendor, amount, description);
     travel.setId(id);
     return travelService.updateTravel(travel);
 }
// ---- DELETE ONE ----
 @DeleteMapping("/api/expenses/{id}")
 public String deleteOne(@PathVariable("id") Long id) {
 	return travelService.deleteTravel(id);
 }

}