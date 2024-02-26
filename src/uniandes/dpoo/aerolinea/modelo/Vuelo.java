package uniandes.dpoo.aerolinea.modelo;

public class Vuelo {

	private String fecha;
	private Ruta ruta;
	private Avion avion;
	
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
	
}
