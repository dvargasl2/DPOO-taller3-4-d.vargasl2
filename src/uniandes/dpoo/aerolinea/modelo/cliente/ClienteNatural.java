package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{
	public String Natural ="Natural";
	private String nombre;
	
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificador() {
		return null;
	}
	public String getTipoCiente() {
		return Natural;
	}
}
