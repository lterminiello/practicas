package model;

import java.util.ArrayList;

public class Company extends Client {

	public Company(String name, double money) {
		super(name, money);
	}

	public void buyPackages(ArrayList<Pack> packages) {
		for (Pack pack : packages) {
			double packPrice = pack.calculatePrice(this);
			if (this.getMoney() >= packPrice) {
				this.setMoney(this.getMoney() - packPrice);
				this.addPackagePurchased(pack);
			} else {
				System.out.println("Error el cliente no tiene dinero suficiente");
			}
		}

	}

}
