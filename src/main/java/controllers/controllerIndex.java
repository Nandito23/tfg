package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerIndex {

	
	@RequestMapping("/vistaIndex")
	public ModelAndView vistaLogin() {
		return new ModelAndView("index");
	}
}
