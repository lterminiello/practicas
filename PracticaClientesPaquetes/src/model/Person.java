package model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person extends Client {

	private static final Logger LOGGER = LoggerFactory.getLogger(Person.class);
	private Pack bookedPackage;
	private static double RESERVATION = 0.50;

	public Person(String name, double money) {
		super(name, money);
	}

	public Pack getBookedPackage() {
		return bookedPackage;
	}

	public void setBookedPackage(Pack bookedPackage) {
		this.bookedPackage = bookedPackage;
	}

	public void bookedPackage(Pack pack) throws ExceptionNotMoney {
		if (this.bookedPackage == null) {
			double packPrice = pack.calculatePrice(this) * RESERVATION;
			if (this.getMoney() >= packPrice) {
				pack.setRest(packPrice);
				this.setMoney(this.getMoney() - packPrice);
				this.setBookedPackage(pack);
			} else {
				throw new ExceptionNotMoney("saldo insuficiente");
			}
		} else {
			throw new ExceptionBookedPackaged("Ya tiene un paquete reservado");
		}
	}

	public void liquidate() throws ExceptionNotMoney {
		if (!this.getBookedPackage().equals(null)) {
			if (this.getMoney() >= this.getBookedPackage().getRest()) {
				this.setMoney(this.getMoney() - this.getBookedPackage().getRest());
				this.getBookedPackage().setRest(0);
				this.addPackagePurchased(this.getBookedPackage());
			} else {
				throw new ExceptionNotMoney("saldo insuficiente");
			}
		} else {
			LOGGER.info("no existen reservas");
		}
	}

}
