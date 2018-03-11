package com.example.demo.pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class ReservasVO.
 */
@Entity
@Table(name="reserva")
public class ReservasVO {

	
	/** The id reserva. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="id_reserva")
	private int idReserva;	
	
	/** The lugar recogida. */
	@Column(name="lugar_recogida")
	private String lugarRecogida;
	
	/** The fecha recogida. */
	@Column(name="fecha_recogida")
	private String fechaRecogida;
	
	/** The fecha devolucion. */
	@Column(name="fecha_devolucion")
	private String fechaDevolucion;
	
	/** The lugar devolucion. */
	@Column(name="lugar_devolucion")
	private String lugarDevolucion;
	
	/** The cuota total. */
	@Column(name="cuota_total")
	private int cuotaTotal;
	
	/** The usuario VO. */
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private UsuarioVO usuarioVO;
	
	 
    /** The coches VO. */
    @ManyToOne
    @JoinColumn(name="id_coche")
    private CochesVO cochesVO;


	/**
	 * Gets the id reserva.
	 *
	 * @return the id reserva
	 */
	public int getIdReserva() {
		return idReserva;
	}


	/**
	 * Sets the id reserva.
	 *
	 * @param idReserva the new id reserva
	 */
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}


	/**
	 * Gets the lugar recogida.
	 *
	 * @return the lugar recogida
	 */
	public String getLugarRecogida() {
		return lugarRecogida;
	}


	/**
	 * Sets the lugar recogida.
	 *
	 * @param lugarRecogida the new lugar recogida
	 */
	public void setLugarRecogida(String lugarRecogida) {
		this.lugarRecogida = lugarRecogida;
	}


	/**
	 * Gets the fecha recogida.
	 *
	 * @return the fecha recogida
	 */
	public String getFechaRecogida() {
		return fechaRecogida;
	}


	/**
	 * Sets the fecha recogida.
	 *
	 * @param fechaRecogida the new fecha recogida
	 */
	public void setFechaRecogida(String fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}


	/**
	 * Gets the fecha devolucion.
	 *
	 * @return the fecha devolucion
	 */
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}


	/**
	 * Sets the fecha devolucion.
	 *
	 * @param fechaDevolucion the new fecha devolucion
	 */
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	/**
	 * Gets the lugar devolucion.
	 *
	 * @return the lugar devolucion
	 */
	public String getLugarDevolucion() {
		return lugarDevolucion;
	}


	/**
	 * Sets the lugar devolucion.
	 *
	 * @param lugarDevolucion the new lugar devolucion
	 */
	public void setLugarDevolucion(String lugarDevolucion) {
		this.lugarDevolucion = lugarDevolucion;
	}


	/**
	 * Gets the cuota total.
	 *
	 * @return the cuota total
	 */
	public int getCuotaTotal() {
		return cuotaTotal;
	}


	/**
	 * Sets the cuota total.
	 *
	 * @param cuotaTotal the new cuota total
	 */
	public void setCuotaTotal(int cuotaTotal) {
		this.cuotaTotal = cuotaTotal;
	}


	/**
	 * Gets the usuario VO.
	 *
	 * @return the usuario VO
	 */
	public UsuarioVO getUsuarioVO() {
		return usuarioVO;
	}


	/**
	 * Sets the usuario VO.
	 *
	 * @param usuarioVO the new usuario VO
	 */
	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}


	/**
	 * Gets the coches VO.
	 *
	 * @return the coches VO
	 */
	public CochesVO getCochesVO() {
		return cochesVO;
	}


	/**
	 * Sets the coches VO.
	 *
	 * @param cochesVO the new coches VO
	 */
	public void setCochesVO(CochesVO cochesVO) {
		this.cochesVO = cochesVO;
	}


	

	

	
	
}
