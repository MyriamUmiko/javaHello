package fr.isika.al18.javaHello.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
	public String index(HttpServletRequest req, ModelMap modelMap) {
		String name = req.getParameter("name") != null 
				&& !req.getParameter("name").isEmpty()
				? req.getParameter("name")
						:"Mr no name";
				modelMap.put("name", name);
	//	model.addAttribute("name", myTab[1]);
		//System.out.println(name);
		return "hello.html";		
	}

}
