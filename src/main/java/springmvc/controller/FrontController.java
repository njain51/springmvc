package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/Clothing")
public class FrontController {
 
	@RequestMapping("/shirt")
	public String shirt(Model model)
	{
		   String str = "user has chosen shirt" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
    
	@RequestMapping("/trousers")
	public String trousers(Model model)
	{
		   String str = "user has chosen trousers" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
	
	@RequestMapping("/jacket")
	public String jacket(Model model)
	{
		   String str = "user has chosen jacket" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
}



