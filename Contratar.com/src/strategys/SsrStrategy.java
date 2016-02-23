package strategys;

import interfaces.Categoria;
import models.Empresa;
import models.Usuario;

public class SsrStrategy implements Categoria {

	@Override
	public double soueldoPromedio(Empresa unaEpresa, Usuario unUsuario) {
		return unUsuario.getAniosExp() * 2000;
	}

}
