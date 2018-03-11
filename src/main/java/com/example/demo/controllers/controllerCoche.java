package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.pojos.CochesVO;
import com.example.demo.pojos.GarajeVO;
import com.example.demo.services.CochesService;
import com.example.demo.services.GarajeService;

/**
 * The Class controllerCoche.
 */
@Controller
public class controllerCoche {

	
	/** The coches service. */
	@Autowired
	CochesService cochesService;
	
	/** The garaje service. */
	@Autowired
	GarajeService garajeService;
	
	
	/**
	 * Lista coches.
	 *
	 * @param model the model
	 * @return the string
	 */
	//LANZA LA VISTA DE COCHES
	@RequestMapping("/vistaCoches")
	public String ListaCoches(Model model) {
	model.addAttribute("coches",cochesService.findAll());	
	return "vistaCoches";
}	
	
	
	/**
	 * Vista formulario coches.
	 *
	 * @return the model and view
	 */
	//COMBO GARAJES FORMULARIO COCHES
	@RequestMapping("/FormularioCoches")
	public ModelAndView vistaFormularioCoches() {
		
	ModelAndView model = new ModelAndView();
	model.addObject("garaje", garajeService.findAll());
	model.setViewName("FormularioCoches");
	return model; //nombre del HTML
	}
	
	
	/**
	 * Adds the coche.
	 *
	 * @param matricula the matricula
	 * @param color the color
	 * @param precio the precio
	 * @param estado the estado
	 * @param marca the marca
	 * @param modelo the modelo
	 * @param combustible the combustible
	 * @param numPlazas the num plazas
	 * @param numKms the num kms
	 * @param potencia the potencia
	 * @param idGaraje the id garaje
	 * @return the model and view
	 */
	//ADD NEW COCHE
	@RequestMapping("/addCoche")
	public ModelAndView addCoche(@RequestParam("matricula") String matricula,@RequestParam("color") String color,
			@RequestParam("precio") Float precio,@RequestParam("estado") String estado,
			@RequestParam("marca") String marca,@RequestParam("modelo") String modelo,
			@RequestParam("combustible") String combustible,@RequestParam("numPlazas") int numPlazas,
			@RequestParam("numKms") int numKms,@RequestParam("potencia") int potencia,@RequestParam("idGaraje") int idGaraje) {
		
		 CochesVO car =new  CochesVO();
		 GarajeVO ga = new GarajeVO();
		 ga.setIdGaraje(idGaraje);
		 car.setMatricula(matricula);
		 car.setColor(color);
		 car.setPrecio(precio);
		 car.setEstado(estado);
		 car.setMarca(marca);
		 car.setModelo(modelo);
		 car.setCombustible(combustible);
		 car.setNumPlazas(numPlazas);
		 car.setNumKms(numKms);
		 car.setPotencia(potencia);
		 car.setGarajeVO(ga);
		 
		 cochesService.save(car);
		 
		return new ModelAndView("FormularioCoches");
		
		}
	
	
	/**
	 * Edits the coche.
	 *
	 * @param idCoches the id coches
	 * @param model the model
	 * @return the string
	 */
	//LLAMA A LA VISTA DE ACTUALIZAR COCHE /+ ID_COCHE EN EL QUE HAS PINCHADO
	@RequestMapping("/UpdateFormularioCoches/{idCoches}")
	public String editCoche(@PathVariable("idCoches") int idCoches, Model model){
        model.addAttribute("coche", cochesService.find(idCoches));
       
        return "UpdateFormularioCoches";
    }
	
	
	/**
	 * Update coche.
	 *
	 * @param matricula the matricula
	 * @param color the color
	 * @param precio the precio
	 * @param estado the estado
	 * @param marca the marca
	 * @param modelo the modelo
	 * @param numPlazas the num plazas
	 * @param numKms the num kms
	 * @param potencia the potencia
	 * @param idCoches the id coches
	 * @return the string
	 */
	//ACTUALIZA LOS COCHES EN LA VISTA FORMULARIO COCHES
	@RequestMapping("/UpdateCoche")
	public String UpdateCoche(@RequestParam("matricula") String matricula,@RequestParam("color") String color,
			@RequestParam("precio") Float precio,@RequestParam("estado") String estado,
			@RequestParam("marca") String marca,@RequestParam("modelo") String modelo,
			@RequestParam("numPlazas") int numPlazas,@RequestParam("numKms") int numKms,
			@RequestParam("potencia") int potencia,@RequestParam("idCoches") int idCoches) {
		
		
		 CochesVO car =cochesService.find(idCoches);
		 
		 car.setMatricula(matricula);
		 car.setColor(color);
		 car.setPrecio(precio);
		 car.setEstado(estado);
		 car.setMarca(marca);
		 car.setModelo(modelo);
		 car.setNumPlazas(numPlazas);
		 car.setNumKms(numKms);
		 car.setPotencia(potencia);
		 
		 cochesService.save(car);
		 
		return "redirect:/vistaCoches";
		
		}
	
	
	/**
	 * Delete garaje.
	 *
	 * @param idCoches the id coches
	 * @return the string
	 */
	//ELIMINAR COCHE /+ ID_COCHE EN EL QUE HAS PINCHADO
	@RequestMapping("/DeleteCoche/{idCoches}")
	public String DeleteGaraje(@PathVariable("idCoches") int idCoches) {
       cochesService.delete(idCoches);
       
    return "redirect:/vistaCoches"; 
    }
	
}
