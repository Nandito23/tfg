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

@Controller
public class controllerCliente {

	
	@Autowired
	UsuarioService userService;	
	
	@Autowired
	CochesService cocheService;
	
	
	
	//LANZA EL FORMULARIO DE REGISTRO CLIENTES
	@RequestMapping("/vistaFormularioCli")
	public ModelAndView vistaFormularioCli() {
		return new ModelAndView("vistaFormularioCli"); //nombre del HTML
	}
	
	
	//ADD NEW CLIENTE
	
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
	
	//LANZA LA VISTA DE COCHES REGISTRADOS
			@RequestMapping("/cochesCli")
			public String ListaGarajes(Model model) {
			model.addAttribute("coches",cocheService.findAll());
				
			return "cochesCli";
		}	
}
