package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
		 
		return new ModelAndView("vistaFormularioAdmin");
		
		}
	
	//LANZA EL FORMULARIO DE REGISTRO EN LA VISTA ADMIN
		@RequestMapping("/vistaFormularioAdmin")
		public ModelAndView vistaFormularioAdmin() {
			return new ModelAndView("vistaFormularioAdmin"); //nombre del HTML
		}
		
		//LLAMA A LA VISTA DE ACTUALIZAR USUARIO /+ ID_USUARIO EN EL QUE HAS PINCHADO
		@RequestMapping("/UpdateFormularioAdmin/{idUsuario}")
		public String editUsuario(@PathVariable("idUsuario") int idUsuario, Model model){
	        model.addAttribute("users", userService.find(idUsuario));
	       
	        return "UpdateFormularioAdmin";
	    }
		
		//UPDATE NEW USER
		@RequestMapping("/UpdateUser")
		public String UpdateUser(@RequestParam("idUsuario") int idUsuario,@RequestParam("dni") String dni,  @RequestParam("nombre") String nombre,
		@RequestParam("apellidos") String apellidos,@RequestParam("direccion") String direccion,
		@RequestParam("tlfno") int tlfno,@RequestParam("email") String email,@RequestParam("pass") String pass,
		@RequestParam("tipo") boolean tipo) {
			
			 UsuarioVO us =new  UsuarioVO();
			 
			 us.setIdUsuario(idUsuario);
			 us.setDni(dni);
			 us.setNombre(nombre);
			 us.setApellidos(apellidos);
			 us.setDireccion(direccion);
			 us.setTlfno(tlfno);
			 us.setEmail(email);
			 us.setPass(pass);
			 us.setTipo(tipo);
			 
			 userService.save(us);
			 
			return "redirect:/vistaUsuarios";
			
			}
		
		
		//LLAMA A LA VISTA DE ELIMINAR USUARIO /+ ID_USUARIO EN EL QUE HAS PINCHADO
				@RequestMapping("/DeleteUser/{idUsuario}")
				public String DeleteUsuario(@PathVariable("idUsuario") int idUsuario) {
			       userService.delete(idUsuario);
			       
			    return "redirect:/vistaUsuarios";
			    }
}
