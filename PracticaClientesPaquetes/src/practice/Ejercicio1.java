package practice;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Company;
import model.ExceptionBookedPackaged;
import model.Pack;
import model.Person;
import model.ExceptionNotMoney;


public class Ejercicio1 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Ejercicio1.class);
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
			LOGGER.error("saldo insuficiiente", e);
			e.printStackTrace();
		}catch (ExceptionBookedPackaged e) {
			LOGGER.error("Ya existe una reserva", e);
		} finally {
			LOGGER.info(String.valueOf(client1.getMoney()));
			LOGGER.debug("gohlasd");
		}
		
		
		ArrayList<Pack> packagesCompanyBuy = new ArrayList<Pack>();
		packagesCompanyBuy.add(pack1);
		packagesCompanyBuy.add(pack2);
		packagesCompanyBuy.add(paqueteMardel);
		
		company.buyPackages(packagesCompanyBuy);
	}
}
