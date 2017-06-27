package com.gicci.sport.tdm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	@RequestMapping(value = {"/", "/dashboard"})
	public String showDashboard(Model model) {
		return "dashboard_view";
	}
	
}
