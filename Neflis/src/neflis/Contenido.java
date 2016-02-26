package neflis;

import java.util.HashSet;

public abstract class Contenido {

	private String nombre;
	private String genero;
	private HashSet<Actor> actoresPrincipales = new HashSet<>();
	private boolean destacado;
	
	public Contenido(String genero, HashSet<Actor> actoresPrincipales, String nombre) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.actoresPrincipales = actoresPrincipales;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public HashSet<Actor> getActoresPrincipales() {
		return actoresPrincipales;
	}

	public void setActoresPrincipales(HashSet<Actor> actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isDestacado() {
		return destacado;
	}

	public void setDestacado(boolean destacado) {
		this.destacado = destacado;
	}

	public abstract int getDuracion();
	
	public abstract boolean visto(Usuario usuario);
	
	public abstract boolean actuo(Actor actor);
	
}
