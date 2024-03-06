package uniandes.dpoo.aerolinea.modelo;

import java.util.HashSet;
import java.util.Set;

import uniandes.dpoo.aerolinea.exceptions.AeropuertoDuplicadoException;

/**
 * Esta clase encapsula la información sobre los aeropuertos e implementa algunas operaciones relacionadas con la ubicación geográfica de los aeropuertos.
 * 
 * No puede haber dos aeropuertos con el mismo código.
 */
public class Aeropuerto
{
	
	private String nombre;
	private String codigo;
	private String nombreCiudad;
	private double latitud;
	private double longitud;
	private static Set<String> codigosUtilizados = new HashSet <String>(); 
	private static int RADIO_TERRESTRE = 6871;
	
	public Aeropuerto(String nombre, String codigo, String nombreCiudad, double latitud, double longitud ) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.nombreCiudad = nombreCiudad;
		this.latitud = latitud;
		this.longitud = longitud;
		
		
	}
	public String getnombre() {
		return this.nombre;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	public String getNombreCiudad() {
		return this.nombreCiudad;
	}
	public double getLatitud() {
		return this.latitud;
	}
	public double gotLongitud() {
		return this.longitud;
	}

    public static int calcularDistancia( Aereopuerto aereopuerto, Aereopuerto aereopuerto2 )
    {
        // Convertir los ángulos a radianes para facilitar las operaciones trigonométricas
        double latAeropuerto1 = Math.toRadians( aereopuerto.getLatitud() );
        double lonAeropuerto1 = Math.toRadians( aereopuerto.getLatitud() );
        double latAeropuerto2 = Math.toRadians( aereopuerto2.getLatitud() );
        double lonAeropuerto2 = Math.toRadians( aereopuerto2.getLatitud() );

        // Calcular la distancia debido a la diferencia de latitud y de longitud
        double deltaX = ( lonAeropuerto2 - lonAeropuerto1 ) * Math.cos( ( latAeropuerto1 + latAeropuerto2 ) / 2 );
        double deltaY = ( latAeropuerto2 - latAeropuerto1 );

        // Calcular la distancia real en kilómetros
        double distancia = Math.sqrt( deltaX * deltaX + deltaY * deltaY ) * RADIO_TERRESTRE;

        return ( int )Math.round( distancia );
    }

}
