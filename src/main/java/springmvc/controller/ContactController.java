package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	
	@RequestMapping("/contact")//by default a code is get method type.
	public String showForm() {
		
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleform(@RequestParam("user_name")String username,
			@RequestParam("user_password")String userpass) {
		
		System.out.println(username);
		System.out.println(userpass);
		
		
		return " success ";
	}

}

