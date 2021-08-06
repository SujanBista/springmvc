package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("this is home url");//HERE WE ARE USING THE ADD ATTRIBUTE ONLY..............
		model.addAttribute("name", "sujan bista");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("abt page");	
		return "about";	
	}
	
	@RequestMapping("/services")
	public ModelAndView services() {
		System.out.println("the service page");
		
		ModelAndView modelAndView = new ModelAndView();// HERE WE CREATING THE OBJECT OF A MODELANDVIEW OBJECT.......
		
		modelAndView.addObject("name","SUJAN Bista");
		modelAndView.setViewName("services");
		
		return modelAndView;
	}
}