package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojos.UsuarioVO;
import com.example.demo.services.UsuarioService;

@Controller
public class controllerUser { //CONTROLADOR DE LOS USUARIOS
	
	@Autowired
	UsuarioService userService;
	
	//CONTROL DEL LOGIN
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
	
	
	//LANZA EL INDEX DE ADMIN
	@RequestMapping("/indexAdministrador")
	public ModelAndView vistaIndexAdmin() {
		return new ModelAndView("indexAdministrador"); //nombre del HTML
	}
	
	//LANZA LA VISTA DE USUARIOS REGISTRADOS
	@RequestMapping("/vistaUsuarios")
	public String ListaUsuarios(Model model) {
		
	model.addAttribute("usuarios",userService.findAll());
		
	return "vistaUsuarios";
}	
	
	//ADD NEW USER
	@RequestMapping("/addUser")
	public ModelAndView addUser(@RequestParam("dni") String dni,  @RequestParam("nombre") String nombre,
	@RequestParam("apellidos") String apellidos,@RequestParam("direccion") String direccion,
	@RequestParam("tlfno") int tlfno,@RequestParam("email") String email,@RequestParam("pass") String pass,
	@RequestParam("tipo") boolean tipo) {
		
		 UsuarioVO us =new  UsuarioVO();
		
		 us.setDni(dni);
		 us.setNombre(nombre);
		 us.setApellidos(apellidos);
		 us.setDireccion(direccion);
		 us.setTlfno(tlfno);
		 us.setEmail(email);
		 us.setPass(pass);
		 us.setTipo(tipo);
		 
		 userService.save(us);
		 
		return new ModelAndView("vistaFormulario");
		
		}
	
	//LANZA EL FORMULARIO DE REGISTRO EN LA VISTA ADMIN
		@RequestMapping("/vistaFormularioAdmin")
		public ModelAndView vistaFormularioAdmin() {
			return new ModelAndView("vistaFormularioAdmin"); //nombre del HTML
		}
}
