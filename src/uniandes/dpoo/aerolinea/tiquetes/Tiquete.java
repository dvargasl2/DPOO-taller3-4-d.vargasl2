package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Cliente clienteComprador;
	private Vuelo vuelo;
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa){
		this.vuelo = vuelo;
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.clienteComprador = clienteComprador;
	}
	public Cliente getCliente() {
		return clienteComprador;
		
	} 
	public Vuelo getVuelo() {
		return vuelo;

	}
	public String getCodigo() {
		return codigo;

	}
	public int getTarifa() {
		return tarifa;

	}
	public void marcarComoUsado() {
		usado = true;

	}
	public boolean esUsado() {
		return usado;
	}
}
