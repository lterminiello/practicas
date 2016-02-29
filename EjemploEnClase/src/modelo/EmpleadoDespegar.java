package modelo;

import interfaces.EstrategiaClientes;

public class EmpleadoDespegar implements EstrategiaClientes {
	
	private static double INDICE = 0.7;

	
	
	
	public EmpleadoDespegar() {
		super();
	}


	public double getIndice() {
		return EmpleadoDespegar.INDICE;
	}
	
	
	public static void setIndice(double indice) {
		EmpleadoDespegar.INDICE = indice;
	}
	
	@Override
	public double precioSinIva(double precio){
		return this.getIndice() * precio;
	}



	
}
