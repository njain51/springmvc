package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// it will return view name
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home URL");
		return "home";
	}
	
	@RequestMapping("/home1")
	public String home1() {
		System.out.println("This is home1 URL");
		return "home1";
	}
	
	// Passing values to view: 
	@RequestMapping("/about")
	public String about(Model model) 
	
	{
		System.out.println("This is about URL");
		String str = "passing some data" ;
        model.addAttribute("message", str);
		   
		return "about";
	}
 
}
