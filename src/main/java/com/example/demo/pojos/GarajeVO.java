package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="garaje")
public class GarajeVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="id_garaje")
	private int idGaraje;
	
	@Column(name="ubicacion")
	private String ubicacion;
	

	public int getIdGaraje() {
		return idGaraje;
	}

	public void setIdGaraje(int idGaraje) {
		this.idGaraje = idGaraje;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
	
	
	

}
