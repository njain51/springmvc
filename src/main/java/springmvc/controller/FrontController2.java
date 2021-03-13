package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/Stationary")
public class FrontController2 {
 
	@RequestMapping("/pens")
	public String pens(Model model)
	{
		   String str = "user has chosen pens" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
    
	@RequestMapping("/pencils")
	public String pencils(Model model)
	{
		   String str = "user has chosen pencils" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
	
	@RequestMapping("/notebooks")
	public String notebooks(Model model)
	{
		   String str = "user has chosen notebooks" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
}



