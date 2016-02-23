package strategys;

import interfaces.Categoria;
import models.Empresa;
import models.Usuario;

public class GerenteStrategy implements Categoria {

	@Override
	public double soueldoPromedio(Empresa unaEpresa, Usuario unUsuario) {
		return (unaEpresa.getCantidadEmpleados() / 10) * unUsuario.getSoueldo();
	}

}
