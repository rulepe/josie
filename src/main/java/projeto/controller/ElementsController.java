package projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ElementsController {

	@GetMapping("/elements")
	public ModelAndView init() {		
	
		ModelAndView modelAndView = new ModelAndView("/pages/elements");
		
		
		return modelAndView;
	}
}
