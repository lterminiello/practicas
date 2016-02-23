package strategys;

import interfaces.Categoria;
import models.Empresa;
import models.Usuario;

public class SrStrategy implements Categoria {

	@Override
	public double soueldoPromedio(Empresa unaEpresa, Usuario unUsuario) {
		return unUsuario.getSoueldo() * 2;
	}

}
