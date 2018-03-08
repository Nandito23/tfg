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

@Entity
@Table(name="coches")
public class CochesVO {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name="id_coches")
private int idCoches;

@Column(name="matricula")
private String matricula;

@Column(name="color")
private String color;

@Column(name="precio")
private float precio;

@Column(name="estado")
private String estado;

@Column(name="marca")
private String marca;

@Column(name="modelo")
private String modelo;

@Column(name="combustible")
private String combustible;

@Column(name="num_plazas")
private int num_plazas;

@Column(name="num_kms")
private int num_kms;

@Column(name="potencia")
private int potencia;


@ManyToOne
@JoinColumn(name="id_garaje")
private GarajeVO garajeVO;


@OneToMany(mappedBy="coches")
private List<ReservasVO> reservasVO;


public int getIdCoches() {
	return idCoches;
}


public void setIdCoches(int idCoches) {
	this.idCoches = idCoches;
}


public String getMatricula() {
	return matricula;
}


public void setMatricula(String matricula) {
	this.matricula = matricula;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public float getPrecio() {
	return precio;
}


public void setPrecio(float precio) {
	this.precio = precio;
}


public String getEstado() {
	return estado;
}


public void setEstado(String estado) {
	this.estado = estado;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public String getCombustible() {
	return combustible;
}


public void setCombustible(String combustible) {
	this.combustible = combustible;
}


public int getNum_plazas() {
	return num_plazas;
}


public void setNum_plazas(int num_plazas) {
	this.num_plazas = num_plazas;
}


public int getNum_kms() {
	return num_kms;
}


public void setNum_kms(int num_kms) {
	this.num_kms = num_kms;
}


public int getPotencia() {
	return potencia;
}


public void setPotencia(int potencia) {
	this.potencia = potencia;
}


public GarajeVO getGarajeVO() {
	return garajeVO;
}


public void setGarajeVO(GarajeVO garajeVO) {
	this.garajeVO = garajeVO;
}


public List<ReservasVO> getReservasVO() {
	return reservasVO;
}


public void setReservasVO(List<ReservasVO> reservasVO) {
	this.reservasVO = reservasVO;
}





	
}
