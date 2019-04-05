package projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class IndexController {

	@GetMapping("/")
	public ModelAndView init() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		return modelAndView;
	}
}
