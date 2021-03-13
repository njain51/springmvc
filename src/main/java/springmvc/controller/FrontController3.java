package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/Grocery")
public class FrontController3 {
 
	@RequestMapping("/bread")
	public String bread(Model model)
	{
		   String str = "user has chosen bread" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
    
	@RequestMapping("/sugar")
	public String sugar(Model model)
	{
		   String str = "user has chosen sugar" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
	
	@RequestMapping("/rice")
	public String rice(Model model)
	{
		   String str = "user has chosen rice" ;
           model.addAttribute("message", str);
		   
		   return "myfirstjsp";
	}
}



