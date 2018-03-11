package com.example.demo.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class CochesVO.
 */
@Entity
@Table(name="coches")
public class CochesVO {

/** The id coches. */
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name="id_coches")
private int idCoches;

/** The matricula. */
@Column(name="matricula")
private String matricula;

/** The color. */
@Column(name="color")
private String color;

/** The precio. */
@Column(name="precio")
private float precio;

/** The estado. */
@Column(name="estado")
private String estado;

/** The marca. */
@Column(name="marca")
private String marca;

/** The modelo. */
@Column(name="modelo")
private String modelo;

/** The combustible. */
@Column(name="combustible")
private String combustible;

/** The num plazas. */
@Column(name="num_plazas")
private int numPlazas;

/** The num kms. */
@Column(name="num_kms")
private int numKms;

/** The potencia. */
@Column(name="potencia")
private int potencia;


/** The garaje VO. */
@ManyToOne
@JoinColumn(name="id_garaje")
private GarajeVO garajeVO;


/** The reservas VO. */
@OneToMany(mappedBy="cochesVO")
private List<ReservasVO> reservasVO;


/**
 * Gets the id coches.
 *
 * @return the id coches
 */
public int getIdCoches() {
	return idCoches;
}


/**
 * Sets the id coches.
 *
 * @param idCoches the new id coches
 */
public void setIdCoches(int idCoches) {
	this.idCoches = idCoches;
}


/**
 * Gets the matricula.
 *
 * @return the matricula
 */
public String getMatricula() {
	return matricula;
}


/**
 * Sets the matricula.
 *
 * @param matricula the new matricula
 */
public void setMatricula(String matricula) {
	this.matricula = matricula;
}


/**
 * Gets the color.
 *
 * @return the color
 */
public String getColor() {
	return color;
}


/**
 * Sets the color.
 *
 * @param color the new color
 */
public void setColor(String color) {
	this.color = color;
}


/**
 * Gets the precio.
 *
 * @return the precio
 */
public float getPrecio() {
	return precio;
}


/**
 * Sets the precio.
 *
 * @param precio the new precio
 */
public void setPrecio(float precio) {
	this.precio = precio;
}


/**
 * Gets the estado.
 *
 * @return the estado
 */
public String getEstado() {
	return estado;
}


/**
 * Sets the estado.
 *
 * @param estado the new estado
 */
public void setEstado(String estado) {
	this.estado = estado;
}


/**
 * Gets the marca.
 *
 * @return the marca
 */
public String getMarca() {
	return marca;
}


/**
 * Sets the marca.
 *
 * @param marca the new marca
 */
public void setMarca(String marca) {
	this.marca = marca;
}


/**
 * Gets the modelo.
 *
 * @return the modelo
 */
public String getModelo() {
	return modelo;
}


/**
 * Sets the modelo.
 *
 * @param modelo the new modelo
 */
public void setModelo(String modelo) {
	this.modelo = modelo;
}


/**
 * Gets the combustible.
 *
 * @return the combustible
 */
public String getCombustible() {
	return combustible;
}


/**
 * Sets the combustible.
 *
 * @param combustible the new combustible
 */
public void setCombustible(String combustible) {
	this.combustible = combustible;
}


/**
 * Gets the num plazas.
 *
 * @return the num plazas
 */
public int getNumPlazas() {
	return numPlazas;
}


/**
 * Sets the num plazas.
 *
 * @param numPlazas the new num plazas
 */
public void setNumPlazas(int numPlazas) {
	this.numPlazas = numPlazas;
}


/**
 * Gets the num kms.
 *
 * @return the num kms
 */
public int getNumKms() {
	return numKms;
}


/**
 * Sets the num kms.
 *
 * @param numKms the new num kms
 */
public void setNumKms(int numKms) {
	this.numKms = numKms;
}


/**
 * Gets the potencia.
 *
 * @return the potencia
 */
public int getPotencia() {
	return potencia;
}


/**
 * Sets the potencia.
 *
 * @param potencia the new potencia
 */
public void setPotencia(int potencia) {
	this.potencia = potencia;
}


/**
 * Gets the garaje VO.
 *
 * @return the garaje VO
 */
public GarajeVO getGarajeVO() {
	return garajeVO;
}


/**
 * Sets the garaje VO.
 *
 * @param garajeVO the new garaje VO
 */
public void setGarajeVO(GarajeVO garajeVO) {
	this.garajeVO = garajeVO;
}


/**
 * Gets the reservas VO.
 *
 * @return the reservas VO
 */
public List<ReservasVO> getReservasVO() {
	return reservasVO;
}


/**
 * Sets the reservas VO.
 *
 * @param reservasVO the new reservas VO
 */
public void setReservasVO(List<ReservasVO> reservasVO) {
	this.reservasVO = reservasVO;
}





	
}
