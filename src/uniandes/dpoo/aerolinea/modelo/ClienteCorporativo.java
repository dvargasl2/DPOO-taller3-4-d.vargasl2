package uniandes.dpoo.aerolinea.modelo;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class ClienteCorporativo extends Cliente {
	
	public String CORPORATIVO;
	public int GRANDE;
	public int MEDIANA;
	public int PEQUEÑA;
	protected String nombreEmpresa;
	protected int tamanoEmpresa;
	
	
	public ClienteCorporativo(String nombreEmpresa, int tamano) {
		this.CORPORATIVO = "Corporativo" ;
		this.tamanoEmpresa = tamano;
		
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa ;
		
	}
	public int getTamanoEmpresa() {
		return tamanoEmpresa;
		
	}
	public String getTipoCliente() {
		return CORPORATIVO;
		
	}
	public ClienteCorporativo cargarDesdeJSON(JSONObject cliente) {
		return null;
		
	}
	public JSONObject salvarEnJSON() {
		return null;
		
	}
	
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

}
