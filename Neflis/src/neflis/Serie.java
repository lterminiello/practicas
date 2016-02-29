package neflis;

import java.util.HashSet;
import java.util.TreeSet;

public class Serie extends Contenido {

	private TreeSet<Temporada> temporadas = new TreeSet<>();

	

	public Serie(String genero, int duracion, HashSet<Actor> actoresPrincipales, String nombre) {
		super(genero, actoresPrincipales,nombre);
	}

	public TreeSet<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(TreeSet<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public int getDuracion() {
		int duracionTotal = 0;
		for (Temporada temporada : temporadas) {
			duracionTotal+= temporada.getDuracion();
		}
		return duracionTotal;
	}

	@Override
	public boolean visto(Usuario usuario) {
		int tempVistas = 0;
		for (Temporada temporada : temporadas) {
			if(temporada.vistaCompleta(usuario)){
				tempVistas++;
			}
		}
		if(tempVistas == this.getTemporadas().size()){
			return true;
		}
		return false;
	}
	
	public Capitulo ultimoCapitulo(){
		return this.getTemporadas().last().getCapitulos().last();
	}

	@Override
	public boolean actuo(Actor actor) {
		if (this.getActoresPrincipales().contains(actor)) {
			return true;
		} else {
			for (Temporada temporada : temporadas) {
				if (temporada.actuo(actor)){
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
}
