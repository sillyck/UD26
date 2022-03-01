package main.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="asignado_a")
public class Asignado_a {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cient_id")
	Cientificos cientificos;
	
	@ManyToOne
	@JoinColumn(name="proyecto_id")
	Proyecto proyecto;
	
	public Asignado_a() {
		
	}
	
	/**
	 * @param id
	 * @param cientificos
	 * @param proyecto
	 */
	public Asignado_a(int id, Cientificos cientificos, Proyecto proyecto) {
		super();
		this.id = id;
		this.cientificos = cientificos;
		this.proyecto = proyecto;
	}
	
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
	 * @return the cientificos
	 */
	public Cientificos getCientificos() {
		return cientificos;
	}
	
	/**
	 * @param cientificos the cientificos to set
	 */
	public void setCientificos(Cientificos cientificos) {
		this.cientificos = cientificos;
	}
	
	/**
	 * @return the proyecto
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}
	
	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignado_a [id=" + id + ", cientificos=" + cientificos + ", proyecto=" + proyecto + "]";
	}
	
	
	
	
}
