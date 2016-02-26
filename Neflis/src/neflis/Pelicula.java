package neflis;

import java.util.HashSet;

public class Pelicula extends Contenido implements Mirable{

	private int duracion;

	public Pelicula(String genero, HashSet<Actor> actoresPrincipales, int duaracion, String nombre) {
		super(genero, actoresPrincipales,nombre);
		this.duracion = duaracion;
	}

	@Override
	public int getDuracion() {
		return this.duracion;
	}

	@Override
	public boolean visto(Usuario usuario) {
		return (usuario.getContenidosVistos().contains(this));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getNombre().equals(((Mirable)obj).getNombre()) ){
			return true;
		} 
		return false;
		
	}

	@Override
	public int getNumero() {
		return 0;
	}

	@Override
	public boolean actuo(Actor actor) {
		return this.getActoresPrincipales().contains(actor);
	}
	
	
}
