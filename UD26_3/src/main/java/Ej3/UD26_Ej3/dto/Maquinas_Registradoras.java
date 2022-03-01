package Ej3.UD26_Ej3.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "maquinas_registradoras")
public class Maquinas_Registradoras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "Piso")
	private int piso;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Maquinas_Registradoras> maquinas_Registradoras;
	
	public Maquinas_Registradoras() {
		
	}
	
	public Maquinas_Registradoras(int id, int piso, List<Maquinas_Registradoras> maquinas_Registradoras) {
		ID = id;
		this.piso = piso;
		this.maquinas_Registradoras = maquinas_Registradoras;
	}
	
	public int getid() {
		return ID;
	}
	public void setid(int id) {
		ID = id;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	@Override
	public String toString() {
		return "Maquinas_Registradoras [id=" + ID + ", piso=" + piso + "]";
	}
	
}
