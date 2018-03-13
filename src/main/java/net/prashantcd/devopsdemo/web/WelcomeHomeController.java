package net.prashantcd.devopsdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class WelcomeHomeController {

	public String sayHello(Model model) {
		model.addAttribute("course", "devops");
		return "index";
	}

}
