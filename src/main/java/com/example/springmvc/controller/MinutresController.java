package com.example.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluraslight.model.Activity;
import com.pluraslight.model.Exercise;

@Controller
@SessionAttributes("goal")
public class MinutresController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println(exercise.getMinutes());
		return "addMinuutes";
		
	}

	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		
		List<Activity> activities = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		return activities;
	}
}
