package fr.isika.al18.javaHello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HelloController {

	@GetMapping({"/","/index"})
	public String index() {
		return "index.html";
	}
	
	@PostMapping("/hello")
	public String index(@RequestBody String name, Model model) {
		String [] myTab = name.split("=");
		model.addAttribute("name", myTab[1]);
		//System.out.println(name);
		return "hello.html";		
	}
}
