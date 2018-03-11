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
 * The Class UsuarioVO.
 */
@Entity
@Table(name="usuario")
public class UsuarioVO {
	
	/** The id usuario. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="id_usuario")
	private int idUsuario;
	
	/** The dni. */
	@Column(name="dni")
	private String dni;
	
	/** The nombre. */
	@Column(name="nombre")
	private String nombre;
	
	/** The apellidos. */
	@Column(name="apellidos")
	private String apellidos;
	
	/** The direccion. */
	@Column(name="direccion")
	private String direccion;
	
	/** The tlfno. */
	@Column(name="tlfno")
	private int tlfno;
	
	/** The email. */
	@Column(name="email")
	private String email;
	
	/** The pass. */
	@Column(name="pass")
	private String pass;
	
	/** The tipo. */
	@Column(name="tipo")
	private boolean tipo;
	
	/** The Lista reserva. */
	@OneToMany(mappedBy="usuarioVO")
	private List<ReservasVO> ListaReserva;

	/**
	 * Gets the id usuario.
	 *
	 * @return the id usuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Sets the id usuario.
	 *
	 * @param idUsuario the new id usuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the tlfno.
	 *
	 * @return the tlfno
	 */
	public int getTlfno() {
		return tlfno;
	}

	/**
	 * Sets the tlfno.
	 *
	 * @param tlfno the new tlfno
	 */
	public void setTlfno(int tlfno) {
		this.tlfno = tlfno;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the pass.
	 *
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * Sets the pass.
	 *
	 * @param pass the new pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * Checks if is tipo.
	 *
	 * @return true, if is tipo
	 */
	public boolean isTipo() {
		return tipo;
	}

	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	/**
	 * Gets the lista reserva.
	 *
	 * @return the lista reserva
	 */
	public List<ReservasVO> getListaReserva() {
		return ListaReserva;
	}

	/**
	 * Sets the lista reserva.
	 *
	 * @param listaReserva the new lista reserva
	 */
	public void setListaReserva(List<ReservasVO> listaReserva) {
		ListaReserva = listaReserva;
	}

	
	
	
	
}
