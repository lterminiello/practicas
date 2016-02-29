package neflis;


import java.util.HashSet;
import java.util.TreeMap;

public class Usuario {

	private String nombre;
	private HashSet<Mirable> contenidosVistos = new HashSet<>();
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Mirable> getContenidosVistos() {
		return contenidosVistos;
	}

	public void setContenidosVistos(HashSet<Mirable> contenidosVistos) {
		this.contenidosVistos = contenidosVistos;
	}
	
	public void ver(Mirable contenido){
		this.getContenidosVistos().add(contenido);
	}
	
	public HashSet<String> generosVistos(){
		HashSet<String> generos = new HashSet<>();
		for (Mirable contenido : this.getContenidosVistos()) {
			generos.add(contenido.getGenero());
		}
		return generos;
	}
	
	public String generoMasVisto(){
		TreeMap<String, Integer> masVisto = new TreeMap<>();
		for (String genero : this.generosVistos()) {
			masVisto.put(genero, 0);
		}
		for (Mirable contenido : getContenidosVistos()) {
			masVisto.put(contenido.getGenero(), masVisto.get(contenido) + contenido.getDuracion());
		}
		return masVisto.firstKey();
		
	}
	
	public boolean fanDe(Actor actor){
		for (Mirable mirable : contenidosVistos) {
			if(!mirable.actuo(actor)){
				return false;
			}
		}
		return true;
	}
	
}
