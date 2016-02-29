package practice;

import java.util.ArrayList;
import model.Company;
import model.Pack;
import model.Person;
import model.ExceptionNotMoney;


public class Ejercicio1 {
	
	public static void main(String[] args) throws ExceptionNotMoney {
		Pack pack1 = new Pack(500, 1.25);
		Pack pack2 = new Pack(100, 1.10);
		Pack paqueteMardel = new Pack(50, 1.20, 2);
		Person client1 = new Person("juan", 2000);
		Person client2 = new Person("pepe", 2000);
		Company company = new Company("carlos", 4000);
		try {
			client1.buyPack(pack1);
			client1.buyPack(paqueteMardel);
			client2.bookedPackage(pack1);
			client2.liquidate();
		} catch (ExceptionNotMoney e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<Pack> packagesCompanyBuy = new ArrayList<Pack>();
		packagesCompanyBuy.add(pack1);
		packagesCompanyBuy.add(pack2);
		packagesCompanyBuy.add(paqueteMardel);
		
		company.buyPackages(packagesCompanyBuy);
		
		System.out.println("Prueba 1 " + client1.getMoney());
		System.out.println("paquetes comprados " + client1.manyPackagePurchased());
		System.out.println("total gastado " + client1.spendPackagePurchased());
		System.out.println("paquete mas caro " + client1.moreExpensivePackaged().calculatePrice(client1));
		
		System.out.println("cliente 2 tiene " + client2.getMoney());
		System.out.println("resta " + client2.getBookedPackage().getRest());
		
		System.out.println(company.getMoney());
		System.out.println(company.manyPackagePurchased());
	}
}
