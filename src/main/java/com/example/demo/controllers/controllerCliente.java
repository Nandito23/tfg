package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojos.UsuarioVO;
import com.example.demo.services.CochesService;
import com.example.demo.services.UsuarioService;

/**
 * The Class controllerCliente.
 */
@Controller
public class controllerCliente {

	
	/** The user service. */
	@Autowired
	UsuarioService userService;	
	
	/** The coche service. */
	@Autowired
	CochesService cocheService;
	
	
	
	/**
	 * Vista formulario cli.
	 *
	 * @return the model and view
	 */
	//LANZA EL FORMULARIO DE REGISTRO CLIENTES
	@RequestMapping("/vistaFormularioCli")
	public ModelAndView vistaFormularioCli() {
		return new ModelAndView("vistaFormularioCli"); //nombre del HTML
	}
	
	
	/**
	 * Vista inicio cli.
	 *
	 * @return the model and view
	 */
	//LANZA EL FORMULARIO DE REGISTRO CLIENTES
		@RequestMapping("/indexClientes")
		public ModelAndView vistaInicioCli() {
			return new ModelAndView("indexClientes"); //nombre del HTML
		}
	
	//ADD NEW CLIENTE
	
	/**
	 * Adds the cliente.
	 *
	 * @param dni the dni
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param direccion the direccion
	 * @param tlfno the tlfno
	 * @param email the email
	 * @param pass the pass
	 * @return the model and view
	 */
	@RequestMapping("/addCliente")
	public ModelAndView addCliente(@RequestParam("dni") String dni,  @RequestParam("nombre") String nombre,
	@RequestParam("apellidos") String apellidos,@RequestParam("direccion") String direccion,
	@RequestParam("tlfno") int tlfno,@RequestParam("email") String email,@RequestParam("pass") String pass) {
		
		 UsuarioVO us =new  UsuarioVO();
		
		 us.setDni(dni);
		 us.setNombre(nombre);
		 us.setApellidos(apellidos);
		 us.setDireccion(direccion);
		 us.setTlfno(tlfno);
		 us.setEmail(email);
		 us.setPass(pass);
		 
		 userService.save(us);
		 
		return new ModelAndView("vistaLogin");
		
		}
	
	/**
	 * Lista garajes.
	 *
	 * @param model the model
	 * @return the string
	 */
	//LANZA LA VISTA DE COCHES REGISTRADOS
			@RequestMapping("/cochesCli")
			public String ListaGarajes(Model model) {
			model.addAttribute("coches",cocheService.findAll());
				
			return "cochesCli";
		}	
			
			
			/**
			 * Vista index.
			 *
			 * @return the model and view
			 */
			@RequestMapping("/index")
			public ModelAndView vistaIndex() {
				return new ModelAndView("index"); //nombre del HTML
			}
			
			
			/**
			 * Vista contacto cli.
			 *
			 * @return the model and view
			 */
			@RequestMapping("/vistaContactoCli")
			public ModelAndView vistaContactoCli() {
				return new ModelAndView("vistaContactoCli"); //nombre del HTML
			}
}
