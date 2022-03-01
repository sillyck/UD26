package Ej3.UD26_Ej3.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Precio")
	private int precio;
	
	@OneToMany
	@JoinColumn(name = "ID")
	private List<Productos> productos;
	
	public Productos() {
		
	}
	
	public Productos(int id, String nombre, int precio, List<Productos> productos) {
		ID = id;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		ID = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Productos [id=" + ID + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}