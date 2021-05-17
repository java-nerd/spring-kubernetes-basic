package com.aj.springboot.kubernetes.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//we are using Thymeleaf, no need for RestController
@Controller
public class MainController {

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("fname", "Ajay");
		model.addAttribute("lname", "Kumar");
		return "index";
	}
}

