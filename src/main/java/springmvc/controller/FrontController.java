package springmvc.controller;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
import org.springframework.ui.Model;


@Controller
@RequestMapping("/Clothing")
public class FrontController {
 
	@RequestMapping("/shirt")
	public String shirt(Model model)
	{
		   String str = "user has chosen shirt" ;
           model.addAttribute("message", str);
           
           // Adding List code: 
           
       		
       		List<String> list1 = new ArrayList<String>();
       		list1.add("Nitin");
       		list1.add("Amit");
       		list1.add("Myra");
       		
       	    model.addAttribute("list",list1);
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



