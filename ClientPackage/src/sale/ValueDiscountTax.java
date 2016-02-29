package sale;

public class ValueDiscountTax {
	
	public static void main(String[] args) {
		if (args.length == 3) {
			try {
				int cant = Integer.parseInt(args[0]);
				float price = Float.parseFloat(args[1]);
				if (args[2].length() == 2) {
					Package pack = new Package(cant, price, args[2]);
					System.out.println(pack.calculated());
				} else {
					System.out.println("Ingrese un Codigo de ciudad valido");
				}
			} catch (NumberFormatException e) {
				System.out.println("Ingrese Cantidad de productos y Precio unitario validos");
			}
		} else {
			System.out.println("Ingrese Cantidad de productos, Precio unitario y Codigo de la ciudad");
		}
	}

}
