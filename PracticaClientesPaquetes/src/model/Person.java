package model;

public class Person extends Client {

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

	public void bookedPackage(Pack pack) {
		double packPrice = pack.calculatePrice(this) * RESERVATION;
		if (this.getMoney() >= packPrice) {
			pack.setRest(packPrice);
			this.setMoney(this.getMoney() - packPrice);
			this.setBookedPackage(pack);
		} else {
			System.out.println("Error el cliente no tiene dinero suficiente");
		}
	}

	public void liquidate() {
		if (!this.getBookedPackage().equals(null)) {
			if (this.getMoney() >= this.getBookedPackage().getRest()) {
				this.setMoney(this.getMoney() - this.getBookedPackage().getRest());
				this.getBookedPackage().setRest(0);
				this.addPackagePurchased(this.getBookedPackage());
			} else {
				System.out.println("Error el cliente para liquidar la reserva");
			}
		} else {
			System.out.println("no existen reservas");
		}
	}

}
