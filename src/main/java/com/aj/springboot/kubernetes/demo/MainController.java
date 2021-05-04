package com.aj.springboot.kubernetes.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

//we are using Thymeleaf, no need for RestController
@Controller
public class MainController {

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("fname", "Ajay");
		model.addAttribute("lname", "Garg");
		return "index";
	}
}

class Test {
	public static void main(String[] args) {
		List<String> v1 = new ArrayList<>();
		v1.add("1");
		v1.add("2");
		v1.add("3");
		List<String> v2 = new ArrayList<>();
		v2.add("2");
		final boolean b = v1.removeAll(v2);
		System.out.println(v1);
	}
}
