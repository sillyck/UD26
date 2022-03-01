package Ej3.UD26_Ej3.dto;

import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "cajeros")
public class Cajeros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "NomApels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Cajeros> cajeors;
	
	public Cajeros() {
		
	}
	
	public Cajeros(int id, String nomApels, List<Cajeros> cajeors) {
		ID = id;
		this.nomApels = nomApels;
		this.cajeors = cajeors;
	}
	
	public int getid() {
		return ID;
	}
	public void setid(int id) {
		ID = id;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	@Override
	public String toString() {
		return "Cajeros [id=" + ID + ", nomApels=" + nomApels + "]";
	}
	
}
