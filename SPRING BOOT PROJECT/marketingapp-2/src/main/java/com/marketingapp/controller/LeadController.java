package com.marketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {
	
//http://localhost:8080/viewCreateLead
	
	@RequestMapping("/viewCreateLead")
	public String viewCreateLeadForm() {
		return "create_registration";
		
	}

}
