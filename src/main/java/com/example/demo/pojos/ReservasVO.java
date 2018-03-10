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
@Table(name="reserva")
public class ReservasVO {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="id_reserva")
	private int idReserva;	
	
	@Column(name="lugar_recogida")
	private String lugarRecogida;
	
	@Column(name="fecha_recogida")
	private String fechaRecogida;
	
	@Column(name="fecha_devolucion")
	private String fechaDevolucion;
	
	@Column(name="lugar_devolucion")
	private String lugarDevolucion;
	
	@Column(name="cuota_total")
	private int cuotaTotal;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private UsuarioVO usuarioVO;
	
	 
    @ManyToOne
    @JoinColumn(name="id_coche")
    private CochesVO cochesVO;


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


	public String getFechaRecogida() {
		return fechaRecogida;
	}


	public void setFechaRecogida(String fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}


	public String getFechaDevolucion() {
		return fechaDevolucion;
	}


	public void setFechaDevolucion(String fechaDevolucion) {
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


	public CochesVO getCochesVO() {
		return cochesVO;
	}


	public void setCochesVO(CochesVO cochesVO) {
		this.cochesVO = cochesVO;
	}


	

	

	
	
}
