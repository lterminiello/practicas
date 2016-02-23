package programa;
import modelo.Cliente;


public class Pruebas {
	public static void main(String[] args) {
		Cliente emp = new Cliente("juan");
		Cliente pax = new Cliente("jauan", 200, 1.30);
		System.out.println(new CalcularPrecio().calcularPrecio(emp, 1000));
		System.out.println(new CalcularPrecio().calcularPrecio(pax, 1000));
	}
}
