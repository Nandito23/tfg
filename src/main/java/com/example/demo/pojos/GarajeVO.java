package com.example.demo.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class GarajeVO.
 */
@Entity
@Table(name="garaje")
public class GarajeVO {
	
	/** The id garaje. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="id_garaje")
	private int idGaraje;
	
	/** The ubicacion. */
	@Column(name="ubicacion")
	private String ubicacion;
	
	/** The Lista coches. */
	@OneToMany(mappedBy="garajeVO")
	private List<CochesVO> ListaCoches;

	/**
	 * Gets the id garaje.
	 *
	 * @return the id garaje
	 */
	public int getIdGaraje() {
		return idGaraje;
	}

	/**
	 * Sets the id garaje.
	 *
	 * @param idGaraje the new id garaje
	 */
	public void setIdGaraje(int idGaraje) {
		this.idGaraje = idGaraje;
	}

	/**
	 * Gets the ubicacion.
	 *
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * Sets the ubicacion.
	 *
	 * @param ubicacion the new ubicacion
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * Gets the lista coches.
	 *
	 * @return the lista coches
	 */
	public List<CochesVO> getListaCoches() {
		return ListaCoches;
	}

	/**
	 * Sets the lista coches.
	 *
	 * @param listaCoches the new lista coches
	 */
	public void setListaCoches(List<CochesVO> listaCoches) {
		ListaCoches = listaCoches;
	}


	

}
