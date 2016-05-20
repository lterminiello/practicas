package programa;
import java.util.ArrayList;
import java.util.List;


public class Pruebas {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(12.0);
		list.add(213.0);
		List<Double> copia;
		copia = (List<Double>)list.clone();
		System.out.println(list);
		System.out.println(copia);
		list.remove(0);
		System.out.println(list);
		System.out.println(copia);
	}
}
