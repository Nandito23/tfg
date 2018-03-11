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

/**
 * The Class controllerUser.
 */
@Controller
public class controllerUser { //CONTROLADOR DE LOS USUARIOS
	
	/** The user service. */
 @Autowired
	UsuarioService userService;
	
	/**
	 * Vista logueo.
	 *
	 * @param email the email
	 * @param pass the pass
	 * @return the model and view
	 */
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
		return new ModelAndView("indexClientes");
		
		}
	
	
	/**
	 * Vista index admin.
	 *
	 * @return the model and view
	 */
	//LANZA EL INDEX DE ADMIN
	@RequestMapping("/indexAdministrador")
	public ModelAndView vistaIndexAdmin() {
		return new ModelAndView("indexAdministrador"); //nombre del HTML
	}
	
	/**
	 * Lista usuarios.
	 *
	 * @param model the model
	 * @return the string
	 */
	//LANZA LA VISTA DE USUARIOS REGISTRADOS
	@RequestMapping("/vistaUsuarios")
	public String ListaUsuarios(Model model) {
		
	model.addAttribute("usuarios",userService.findAll());
		
	return "vistaUsuarios";
}	
	
	/**
	 * Adds the user.
	 *
	 * @param dni the dni
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param direccion the direccion
	 * @param tlfno the tlfno
	 * @param email the email
	 * @param pass the pass
	 * @param tipo the tipo
	 * @return the model and view
	 */
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
	
	/**
	 * Vista formulario admin.
	 *
	 * @return the model and view
	 */
	//LANZA EL FORMULARIO DE REGISTRO EN LA VISTA ADMIN
		@RequestMapping("/vistaFormularioAdmin")
		public ModelAndView vistaFormularioAdmin() {
			return new ModelAndView("vistaFormularioAdmin"); //nombre del HTML
		}
		
		/**
		 * Edits the usuario.
		 *
		 * @param idUsuario the id usuario
		 * @param model the model
		 * @return the string
		 */
		//LLAMA A LA VISTA DE ACTUALIZAR USUARIO /+ ID_USUARIO EN EL QUE HAS PINCHADO
		@RequestMapping("/UpdateFormularioAdmin/{idUsuario}")
		public String editUsuario(@PathVariable("idUsuario") int idUsuario, Model model){
	        model.addAttribute("users", userService.find(idUsuario));
	       
	        return "UpdateFormularioAdmin";
	    }
		
		/**
		 * Update user.
		 *
		 * @param idUsuario the id usuario
		 * @param dni the dni
		 * @param nombre the nombre
		 * @param apellidos the apellidos
		 * @param direccion the direccion
		 * @param tlfno the tlfno
		 * @param email the email
		 * @param pass the pass
		 * @param tipo the tipo
		 * @return the string
		 */
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
		
		
		        /**
        		 * Delete usuario.
        		 *
        		 * @param idUsuario the id usuario
        		 * @return the string
        		 */
        		//ELIMINAR USUARIO /+ ID_USUARIO EN EL QUE HAS PINCHADO
				@RequestMapping("/DeleteUser/{idUsuario}")
				public String DeleteUsuario(@PathVariable("idUsuario") int idUsuario) {
			       userService.delete(idUsuario);
			       
			    return "redirect:/vistaUsuarios"; 
			    }
}
