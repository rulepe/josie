package projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactsController {

	@GetMapping("/contact")
	public ModelAndView init() {
		
		ModelAndView modelAndView = new ModelAndView("/pages/contact");
	
		return modelAndView;
	}
	
}
