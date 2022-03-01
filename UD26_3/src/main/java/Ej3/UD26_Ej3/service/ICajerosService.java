package Ej3.UD26_Ej3.service;

import java.util.List;

import Ej3.UD26_Ej3.dto.Cajeros;

public interface ICajerosService {

	public List<Cajeros> listarCajeros();

	public Cajeros guardarCajeros(Cajeros Cajeros);

	public Cajeros CajerosXID(int ID);

	public Cajeros actualizarCajeros(Cajeros Cajeros);

	public void eliminarCajeros(int ID);
}