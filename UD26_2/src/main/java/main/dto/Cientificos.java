package main.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientificos {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="dni")
	private String dni;
	@Column(name="nomApels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Asignado_a> asignado_a;

	//Constructor
	public Cientificos() {
		
	}
	
	/**
	 * @param id
	 * @param dni
	 * @param nomApels
	 * @param asignado_a
	 */
	public Cientificos(int id, String dni, String nomApels, List<Asignado_a> asignado_a) {
		//super();
		this.id = id;
		this.dni = dni;
		this.nomApels = nomApels;
		this.asignado_a = asignado_a;
	}
	
	//Getters y setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}
	
	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	
	/**
	 * @return the asignado_a
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="Asignado_a")
	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}
	
	/**
	 * @param asignado_a the asignado_a to set
	 */
	public void setAsignado_a(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}

	@Override
	public String toString() {
		return "Cientificos [id=" + id + ", dni=" + dni + ", nomApels=" + nomApels + "]";
	}
	
	
	
	
	
	
}
