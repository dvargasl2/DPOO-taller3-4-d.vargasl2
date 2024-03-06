package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Map<String, Tiquete> tiquetes = null;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		
		this.fecha = fecha;
		this.avion = avion;
		this.ruta= ruta;
	}
	
	public Ruta getRuta() {
		return ruta;	
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return avion;
		
	}
	public Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}
	
}
