package com.gicci.sport.tdm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeamController {

	@RequestMapping("/list")
	public String list(@RequestParam(name = "page", value = "1", required = true) Integer page, Model model) {
		return "team_list";
	}
	
}
