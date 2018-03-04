package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojos.UsuarioVO;
import com.example.demo.services.UsuarioService;

@Controller
public class controllerUser { //CONTROLADOR DE LOS USUARIOS
	
	@Autowired
	UsuarioService userService;
	
	
	@RequestMapping("/Login")
	public ModelAndView vistaLogueo(@RequestParam("email") String email,  @RequestParam("pass") String pass) {
		System.err.println("entra");
		 UsuarioVO us = userService.ValidarLogin(email, pass);
		 
		if(us==null) {
		return new ModelAndView("vistaLogin");
		
		}else if(us.isTipo()==true) {
		return new ModelAndView("indexAdministrador");
		
		}
		return new ModelAndView("vistaLogin");
		
		}
		
	}	
	
	


