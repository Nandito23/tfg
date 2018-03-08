package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.pojos.CochesVO;
import com.example.demo.services.CochesService;
import com.example.demo.services.GarajeService;

@Controller
public class controllerCoche {

	
	@Autowired
	CochesService cochesService;
	
	@Autowired
	GarajeService garajeService;
	
	
	//LANZA LA VISTA DE COCHES
	@RequestMapping("/vistaCoches")
	public String ListaCoches(Model model) {
	model.addAttribute("coches",cochesService.findAll());
	model.addAttribute("garajes",garajeService.findAll());		
	return "vistaCoches";
}	
	
	
	//LANZA EL FORMULARIO DE REGISTRO DE COCHES
	@RequestMapping("/FormularioCoches")
	public ModelAndView vistaFormularioCoches() {
		return new ModelAndView("FormularioCoches"); //nombre del HTML
	}
	
	//ADD NEW COCHE
	@RequestMapping("/addCoche")
	public ModelAndView addCoche(@RequestParam("ubicacion") String ubicacion) {
		
		 CochesVO car =new  CochesVO();
		
		 
		 
		 cochesService.save(car);
		 
		return new ModelAndView("FormularioGarajes");
		
		}
	
	
}
