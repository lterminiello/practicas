package models;

import java.util.ArrayList;

import interfaces.Categoria;

public class Usuario {
	
	private Empresa empresa;
	private double soueldo;
	private Categoria categoria;
	private int aniosExp;
	private ArrayList<Empresa> empresasTrabajo = new ArrayList<>();
	
	public Usuario(Empresa empresa, double soueldo, Categoria categoria, int aniosExp) {
		super();
		this.empresa = empresa;
		this.soueldo = soueldo;
		this.categoria = categoria;
		this.aniosExp = aniosExp;
		this.empresasTrabajo.add(empresa);
	}
	public Usuario(int aniosExp, Categoria categoria) {
		super();
		this.categoria = categoria;
		this.aniosExp = aniosExp;
	}


	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public double getSoueldo() {
		return soueldo;
	}
	public void setSoueldo(double soueldo) {
		this.soueldo = soueldo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getAniosExp() {
		return aniosExp;
	}
	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	public double sueldoEsperado(Empresa unaEmpresa){
		return this.getCategoria().soueldoPromedio(unaEmpresa, this);
	}
	
	public void escucharOferta(Empresa empres){
		
	}
}
