package projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortfolioController {

	
	@GetMapping("/portfolio")
	public ModelAndView init() {
		
		ModelAndView modelAndView = new ModelAndView("/pages/portfolio");
		
		return modelAndView;		
	}
	
}
