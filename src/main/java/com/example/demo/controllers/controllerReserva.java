package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojos.CochesVO;
import com.example.demo.pojos.ReservasVO;
import com.example.demo.pojos.UsuarioVO;
import com.example.demo.services.ReservasService;

@Controller
public class controllerReserva {

	@Autowired
	ReservasService reservasService;

	//LANZA LA VISTA DE RESERVAS REGISTRADOS
	@RequestMapping("/vistaReservas")
	public String ListaReservas(Model model) {
	model.addAttribute("reservas",reservasService.findAll());
		
	return "vistaReservas";
}	
	
	//LANZA EL FORMULARIO DE REGISTRO DE RESERVAS
	@RequestMapping("/FormularioReservas")
	public ModelAndView vistaFormularioReserva() {
		return new ModelAndView("FormularioReservas"); //nombre del HTML
	}
	
	//ADD NEW RESERVA
	@RequestMapping("/addReserva")
	public ModelAndView addReserva(@RequestParam("lugarRecogida") String lugarRecogida,@RequestParam("fechaRecogida") String fechaRecogida,
	@RequestParam("fechaDevolucion") String fechaDevolucion,@RequestParam("lugarDevolucion") String lugarDevolucion,
	@RequestParam("cuotaTotal") int cuotaTotal,@RequestParam("idUsuario") int idUsuario,
	@RequestParam("idCoches") int idCoches) {
		
	 UsuarioVO us = new UsuarioVO();
	 CochesVO coche = new CochesVO();
	 ReservasVO rs = new ReservasVO();
	 
	 us.setIdUsuario(idUsuario);
	 coche.setIdCoches(idCoches);
	 
	 rs.setLugarRecogida(lugarRecogida);
	 rs.setFechaRecogida(fechaRecogida);
	 rs.setFechaDevolucion(fechaDevolucion);
	 rs.setLugarDevolucion(lugarDevolucion);
	 rs.setCuotaTotal(cuotaTotal);
	 rs.setUsuarioVO(us);
	 rs.setCochesVO(coche);
	 reservasService.save(rs);
	 
	return new ModelAndView("FormularioReservas");
		
	}
	
	//ELIMINAR RESERVA /+ ID_RESERVA EN EL QUE HAS PINCHADO
	@RequestMapping("/DeleteReserva/{idReserva}")
	public String DeleteReserva(@PathVariable("idReserva") int idReserva) {
       reservasService.delete(idReserva);
       
    return "redirect:/vistaReservas"; 
    }
	
}
