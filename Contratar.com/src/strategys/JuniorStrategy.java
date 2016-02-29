package strategys;

import interfaces.Categoria;
import models.Empresa;
import models.Usuario;

public class JuniorStrategy implements Categoria {

	private static JuniorStrategy instancia;
	
	@Override
 	public double soueldoPromedio(Empresa unaEpresa, Usuario unUsuario) {
		if(unaEpresa.getSueldoBase() < unUsuario.getSoueldo()){
			return unUsuario.getSoueldo();
		} else {
			return unaEpresa.getSueldoBase();
		}
	}

	public static JuniorStrategy getInstacia(){
		if(instancia == null){
			instancia = new JuniorStrategy();
			return instancia;
		}
		return instancia;
	}
}
