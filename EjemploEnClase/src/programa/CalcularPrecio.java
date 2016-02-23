package programa;

import modelo.Cliente;

public class CalcularPrecio {
	
	private static double iva = 1.21;
	
	public double calcularPrecio(Cliente unaPersona, int unPrecio){
		return  unaPersona.precioSinIva(unPrecio) * iva;
	}
}
