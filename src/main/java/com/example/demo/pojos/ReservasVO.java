package com.example.demo.pojos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class ReservasVO {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="id_reserva")
	private int idReserva;	
	
	@Column(name="lugar_recogida")
	private String lugarRecogida;
	
	@Column(name="fecha_recogida")
	private Date fechaRecogida;
	
	@Column(name="fecha_devolucion")
	private Date fechaDevolucion;
	
	@Column(name="lugar_devolucion")
	private String lugarDevolucion;
	
	@Column(name="cuota_total")
	private int cuotaTotal;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private UsuarioVO usuarioVO;
	
	 
    @ManyToOne
    @JoinColumn(name="id_coche")
    private CochesVO coches;


	public int getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}


	public String getLugarRecogida() {
		return lugarRecogida;
	}


	public void setLugarRecogida(String lugarRecogida) {
		this.lugarRecogida = lugarRecogida;
	}


	public Date getFechaRecogida() {
		return fechaRecogida;
	}


	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}


	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}


	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	public String getLugarDevolucion() {
		return lugarDevolucion;
	}


	public void setLugarDevolucion(String lugarDevolucion) {
		this.lugarDevolucion = lugarDevolucion;
	}


	public int getCuotaTotal() {
		return cuotaTotal;
	}


	public void setCuotaTotal(int cuotaTotal) {
		this.cuotaTotal = cuotaTotal;
	}


	public UsuarioVO getUsuarioVO() {
		return usuarioVO;
	}


	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}


	public CochesVO getCoches() {
		return coches;
	}


	public void setCoches(CochesVO coches) {
		this.coches = coches;
	}
	
	

	

	
	
}
