package springmvc.controller;
import java.util.List;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
 
	 @RequestMapping("/getdetails")
	 public String getDetails() {
		 return "getdetails";
	 }
	 
	 @RequestMapping(path ="/processForm", method= RequestMethod.POST)
	 public String processForm(@RequestParam String userName, @RequestParam int userAge ,@RequestParam String userEmail, Model model)  {
		 System.out.println("user Name is " + userName);
		 System.out.println("user Age is " + userAge);
		 System.out.println("user Email is " + userEmail);
		 
		 model.addAttribute("email",userEmail);
		 model.addAttribute("name",userName);		 
		 model.addAttribute("age",userAge);
		 
		 
		 return "myfirstjsp";
	 }
	 
	
}



