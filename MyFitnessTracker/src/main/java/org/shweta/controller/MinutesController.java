package org.shweta.controller;

import java.util.ArrayList;
import java.util.List;

import org.shweta.model.Activity;
import org.shweta.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise)
	{
		System.out.println("Minutes Exercised " + exercise.getMinutes());
		//return "forward:addMoreMinutes.html";//addMinutes.jsp
		//return "redirect:addMoreMinutes.html";//redirect is a complete new request ,... no old data can be accessed
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities()
	{
		List<Activity> activities = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("bike");
		activities.add(bike);
		
		
		Activity swim = new Activity();
		swim.setDesc("swim");
		activities.add(swim);
		
		
		Activity walk = new Activity();
		walk.setDesc("walk");
		activities.add(walk);
		
		
		
		return activities;
		
	}
	
	
	/*@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise)
	{
		System.out.println("Exercising " + exercise.getMinutes());
		return "addMinutes";//addMinutes.jsp
	}*/
}
