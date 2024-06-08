package com.nabil.NinjaGoldGame.controllers;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProcessController {

	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@RequestParam(value="hidden_location") String hidden_location, HttpSession session) {
		LocalDate localDate = LocalDate.now();
		int month = localDate.getDayOfMonth();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(getPattern(month));
		String date = localDate.format(formatter);
		LocalTime localTime = LocalTime.now();
		String time = new SimpleDateFormat("HH:mm a").format(new Date());
		String timeStamp = date + " " + time;
		
		
		if(hidden_location.equals("farm")) {
			int num = ThreadLocalRandom.current().nextInt(10, 21);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a farm and earned " + num + " gold. (" + timeStamp + ")");
		}
		if(hidden_location.equals("cave")) {
			int num = ThreadLocalRandom.current().nextInt(5, 11);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a cave and earned " + num + " gold. (" + timeStamp + ")");
		}
		if(hidden_location.equals("house")) {
			int num = ThreadLocalRandom.current().nextInt(2, 6);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a house and earned " + num + " gold. (" + timeStamp + ")");
		}
		if(hidden_location.equals("casino")) {
			int num = ThreadLocalRandom.current().nextInt(-50, 51);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			if (num > 0) {
				activities.add(0, "You entered a casino and earned " + num + " gold. (" + timeStamp + ")");
			} else {
				activities.add(0, "You entered a casino and lost " + num + " gold.Ouch. (" + timeStamp + ")");
			}
		}
		if(hidden_location.equals("spa")) {
			int num = ThreadLocalRandom.current().nextInt(-20, -4);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a house and lost " + num + " gold.Ouch (" + timeStamp + ")");
		}
		return "redirect:/";
	}
	
	public static String getPattern(int month) {
	    String first = "MMMM dd";
	    String last = " yyyy";
	    String pos = (month == 1 || month == 21 || month == 31) ? "'st'" : (month == 2 || month == 22) ? "'nd'" : (month == 3 || month == 23) ? "'rd'" : "'th'";
	    return first + pos + last;
	}

}
