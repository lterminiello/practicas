package neflis;

import java.util.TreeSet;

public class Temporada {

	private TreeSet<Capitulo> capitulos = new TreeSet<>();
	private int cantidadCapitulos;
	private int numeroTemporada;
	private Serie serie;

	public Temporada(TreeSet<Capitulo> capitulos, int cantidadCapitulos, int numeroTemporada, Serie serie) {
		super();
		this.capitulos = capitulos;
		this.cantidadCapitulos = cantidadCapitulos;
		this.numeroTemporada = numeroTemporada;
		this.serie = serie;
	}

	public TreeSet<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(TreeSet<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	public int getCantidadCapitulos() {
		return cantidadCapitulos;
	}

	public void setCantidadCapitulos(int cantidadCapitulos) {
		this.cantidadCapitulos = cantidadCapitulos;
	}

	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}
	
	
	
	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public boolean vistaCompleta(Usuario usuario){
		int vistos = 0;
		for (Capitulo capitulo : this.getCapitulos()) {
			if (usuario.getContenidosVistos().contains(capitulo)) {
				vistos++;
			}
		}
		if(this.getCapitulos().size() == vistos){
			return true;
		}
		return false;
	}
	
	public int getDuracion(){
		int duacionTotalTemp = 0;
		for (Capitulo capitulo : capitulos) {
			duacionTotalTemp+= capitulo.getDuracion();
		}
		return duacionTotalTemp;
	}
	
	public boolean actuo(Actor actor){
		for (Capitulo capitulo : capitulos) {
			if(capitulo.getActoresInvitados().contains(actor)){
				return true;
			}
		}
		return false;
		}
}
