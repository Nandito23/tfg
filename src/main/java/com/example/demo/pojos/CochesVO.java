package com.example.demo.pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
private int numPlazas;

@Column(name="num_kms")
private int numKms;

@Column(name="potencia")
private int cv;


@ManyToOne
@JoinColumn(name="id_garaje")
private GarajeVO garajeVO;

@ManyToOne
@JoinColumn(name="id_reserva")
private ReservasVO reservasVO;

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

public int getNumPlazas() {
	return numPlazas;
}

public void setNumPlazas(int numPlazas) {
	this.numPlazas = numPlazas;
}

public int getNumKms() {
	return numKms;
}

public void setNumKms(int numKms) {
	this.numKms = numKms;
}

public int getCv() {
	return cv;
}

public void setCv(int cv) {
	this.cv = cv;
}

public GarajeVO getGarajeVO() {
	return garajeVO;
}

public void setGarajeVO(GarajeVO garajeVO) {
	this.garajeVO = garajeVO;
}

public ReservasVO getReservasVO() {
	return reservasVO;
}

public void setReservasVO(ReservasVO reservasVO) {
	this.reservasVO = reservasVO;
}







	
}
