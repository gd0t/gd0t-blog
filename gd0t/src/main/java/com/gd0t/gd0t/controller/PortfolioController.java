package com.gd0t.gd0t.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
	
	/*
	 * The two mappings look for their
	 * respective html pages
	 * */
	
	@GetMapping("/resume")
	public String showResume() {
		return "resume";	
	}
	
	@GetMapping("/projects")
	public String showProjects() {
		return "projects";
	}
}
