package neflis;

public class generoDuracion {
	
	private String genero;
	private int duracion;
	
	public generoDuracion(String genero) {
		super();
		this.genero = genero;
		this.duracion = 0;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getGenero().equals(((generoDuracion)obj).getGenero());
	}
	

}
