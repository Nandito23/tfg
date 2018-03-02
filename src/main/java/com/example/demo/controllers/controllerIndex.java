package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerIndex { //CONTROLADOR DE LA VISTA PRINCIPAL

	//LANZA LA VISTA PRINCIPAL
	@RequestMapping("/vistaIndex")
	public ModelAndView vistaPrincipal() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/vistaLogin")
	public ModelAndView vistaLogueo() {
		return new ModelAndView("vistaLogin");
	}
	
	
}

