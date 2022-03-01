package Ej3.UD26_Ej3.dto;

import javax.persistence.*;

@Entity
@Table(name="venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@ManyToOne
	@JoinColumn(name = "cajero")
	Cajeros cajeros;
	
	@ManyToOne
	@JoinColumn(name = "Maquina")
	Maquinas_Registradoras maquina;
	
	@ManyToOne
	@JoinColumn(name = "Producto")
	Productos productos;

	public Venta() {
		
	}
	
	public Venta(int iD, Cajeros cajeros, Maquinas_Registradoras maquina, Productos productos) {
		ID = iD;
		this.cajeros = cajeros;
		this.maquina = maquina;
		this.productos = productos;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Cajeros getCajeros() {
		return cajeros;
	}

	public void setCajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}

	public Maquinas_Registradoras getMaquina() {
		return maquina;
	}

	public void setMaquina(Maquinas_Registradoras maquina) {
		this.maquina = maquina;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Venta [ID=" + ID + ", cajeros=" + cajeros + ", maquina=" + maquina + ", productos=" + productos + "]";
	}

}
