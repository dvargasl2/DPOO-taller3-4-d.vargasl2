package uniandes.dpoo.aerolinea.persistencia;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;


public interface IPersistenciaAerolinea {
	public void cargarAereolinea(String archivo, Aerolinea aereolinea);
	public void salvarAerolinea(String archivo, Aerolinea aereolinea);
}
