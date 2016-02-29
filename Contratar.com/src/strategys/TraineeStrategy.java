package strategys;

import interfaces.Categoria;
import models.Empresa;
import models.Usuario;

public class TraineeStrategy implements Categoria {

	@Override
	public double soueldoPromedio(Empresa unaEpresa, Usuario unUsuario) {
		return unaEpresa.getSueldoBase();
	}

}
