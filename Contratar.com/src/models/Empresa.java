package models;

public class Empresa {
	
	private double sueldoBase;
	private int cantidadEmpleados;
	
	public Empresa(double sueldoBase, int cantidadEmpleados) {
		super();
		this.sueldoBase = sueldoBase;
		this.cantidadEmpleados = cantidadEmpleados;
	}
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
	
	

}
