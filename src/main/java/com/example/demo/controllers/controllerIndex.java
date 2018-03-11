package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerIndex { //CONTROLADOR DE LA VISTA PRINCIPAL

	//LANZA LA VISTA PRINCIPAL
	@RequestMapping("/vistaIndex") //RUTA EN EL HTML
	public ModelAndView vistaPrincipal() {
		return new ModelAndView("index");
	}
	
	//LANZA LA VISTA DE LOGIN
 	@RequestMapping("/vistaLogin")
	public ModelAndView vistaLogueo() {
		return new ModelAndView("vistaLogin"); //nombre del HTML
	}
	
 	//LANZA LA VISTA DE CONTACTO
 	 	@RequestMapping("/vistaContacto")
 		public ModelAndView vistaContacto() {
 			return new ModelAndView("vistaContacto"); //nombre del HTML
 		}
 		
}

