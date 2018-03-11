package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.pojos.GarajeVO;
import com.example.demo.services.GarajeService;


/**
 * The Class controllerGaraje.
 */
@Controller
public class controllerGaraje {

	/** The garaje service. */
	@Autowired
	GarajeService garajeService;
	
		
		
		/**
		 * Lista garajes.
		 *
		 * @param model the model
		 * @return the string
		 */
		//LANZA LA VISTA DE Garajes REGISTRADOS
		@RequestMapping("/vistaGarajes")
		public String ListaGarajes(Model model) {
		model.addAttribute("garajes",garajeService.findAll());
			
		return "vistaGarajes";
	}	
		
		/**
		 * Vista formulario admin.
		 *
		 * @return the model and view
		 */
		//LANZA EL FORMULARIO DE REGISTRO DE GARAJES
				@RequestMapping("/FormularioGarajes")
				public ModelAndView vistaFormularioAdmin() {
					return new ModelAndView("FormularioGarajes"); //nombre del HTML
				}
		
				/**
				 * Adds the garaje.
				 *
				 * @param ubicacion the ubicacion
				 * @return the model and view
				 */
				//ADD NEW Garaje
				@RequestMapping("/addGaraje")
				public ModelAndView addGaraje(@RequestParam("ubicacion") String ubicacion) {
					
					 GarajeVO gara =new  GarajeVO();
					
					 gara.setUbicacion(ubicacion);
					 
					 garajeService.save(gara);
					 
					return new ModelAndView("FormularioGarajes");
					
					}
				
				
				/**
				 * Edits the garaje.
				 *
				 * @param idGaraje the id garaje
				 * @param model the model
				 * @return the string
				 */
				//LLAMA A LA VISTA DE ACTUALIZAR GARAJE /+ ID_GARAJE EN EL QUE HAS PINCHADO
				@RequestMapping("/UpdateFormularioGarajes/{idGaraje}")
				public String editGaraje(@PathVariable("idGaraje") int idGaraje, Model model){
			        model.addAttribute("garaje", garajeService.find(idGaraje));
			       
			        return "UpdateFormularioGarajes";
			    }
				
				/**
				 * Update user.
				 *
				 * @param ubicacion the ubicacion
				 * @param idGaraje the id garaje
				 * @return the string
				 */
				//ACTUALIZA LOS GARAJES EN LA VISTA FORMULARIO GARAJES
				@RequestMapping("/UpdateGaraje")
				public String UpdateUser(@RequestParam("ubicacion") String ubicacion,@RequestParam("idGaraje") int idGaraje) {
					
					 GarajeVO gara =new  GarajeVO();
					
					 gara.setIdGaraje(idGaraje);
					 gara.setUbicacion(ubicacion);
					 
					 garajeService.save(gara);
					 
					return "redirect:/vistaGarajes";
					
					}
				
				/**
				 * Delete garaje.
				 *
				 * @param idGaraje the id garaje
				 * @return the string
				 */
				//ELIMINAR GARAJE /+ ID_GARAJE EN EL QUE HAS PINCHADO
				@RequestMapping("/DeleteGarajes/{idGaraje}")
				public String DeleteGaraje(@PathVariable("idGaraje") int idGaraje) {
			       garajeService.delete(idGaraje);
			       
			    return "redirect:/vistaGarajes"; 
			    }
				
				
				
}
