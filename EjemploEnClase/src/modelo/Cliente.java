package modelo;

import interfaces.EstrategiaClientes;

public class Cliente {

	private String nombre;
	private EstrategiaClientes tipo;
	
	

	public Cliente(String nombre, double comision, double indice) {
		super();
		this.nombre = nombre;
		this.tipo = new Pasajero(indice, comision);
	}

	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.tipo = new EmpleadoDespegar();
	}
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public EstrategiaClientes getTipo() {
		return tipo;
	}



	public void setTipo(EstrategiaClientes tipo) {
		this.tipo = tipo;
	}



	public double precioSinIva(double precio){
		return tipo.precioSinIva(precio);
	}
	
	
}
