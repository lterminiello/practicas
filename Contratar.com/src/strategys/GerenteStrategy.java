package strategys;

import interfaces.Categoria;
import models.Empresa;
import models.Usuario;

public class GerenteStrategy implements Categoria {
	
	private static GerenteStrategy instancia;
	
	private GerenteStrategy() {
	}

	@Override
	public double soueldoPromedio(Empresa unaEpresa, Usuario unUsuario) {
		return (unaEpresa.getCantidadEmpleados() / 10) * unUsuario.getSoueldo();
	}

	public static GerenteStrategy getInstacia(){
		if(instancia == null){
			instancia = new GerenteStrategy();
			return instancia;
		}
		return instancia;
	}
}
