package modelo;

import interfaces.EstrategiaClientes;

public class Pasajero implements EstrategiaClientes{

	private double indece;
	private double comision;
	
	
	
	public Pasajero(double indece, double comision) {
		super();
		this.indece = indece;
		this.comision = comision;
	}

	public double getIndice() {
		return this.indece;
	}
	
	public void setIndice(double indice){
		this.indece = indice;
	}
	
	public double getComision(){
		return this.comision;
	}
	 
	public void setComision(double comision){
		this.comision = comision;
	}
	
	public double precioSinIva(double precio){
		return this.getIndice() * precio + this.getComision();
	}

}
