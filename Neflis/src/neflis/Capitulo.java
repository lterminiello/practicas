package neflis;

import java.util.HashSet;

public class Capitulo implements Mirable{

	private HashSet<Actor> actoresInvitados = new HashSet<>();
	private int duracion;
	private int numero;
	private Temporada temporada;
	
	public Capitulo(HashSet<Actor> actoresInvitados, int duracion, int numero, Temporada temporada) {
		super();
		this.actoresInvitados = actoresInvitados;
		this.duracion = duracion;
		this.numero = numero;
		this.temporada = temporada;
	}

	public HashSet<Actor> getActoresInvitados() {
		return actoresInvitados;
	}

	public void setActoresInvitados(HashSet<Actor> actoresInvitados) {
		this.actoresInvitados = actoresInvitados;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	public String getGenero() {
		return this.getTemporada().getSerie().getGenero();
	}
	
	

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.getNumero() == ((Mirable)obj).getNumero() ){
			return true;
		} 
		return false;
		
	}

	@Override
	public String getNombre() {
		return null;
	}
	
	public boolean actuo(Actor actor){
		return this.getTemporada().getSerie().actuo(actor);
	}
	
	
}
