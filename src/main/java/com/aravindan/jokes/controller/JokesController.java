package com.aravindan.jokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aravindan.jokes.services.JokesService;

@Controller
public class JokesController {
	
	private JokesService jokesService;
	
	@Autowired
	public JokesController(JokesService jokesService) {
		super();
		this.jokesService = jokesService;
	}
	@RequestMapping({"/", ""})
	public String showQuote(Model model) {
		model.addAttribute("joke", jokesService.getQuotes());
		return "chucknorris";
	}
	
	
}
