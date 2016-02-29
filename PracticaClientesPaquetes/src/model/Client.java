package model;

import java.util.ArrayList;

public abstract class Client {

	private String name;
	private double money;
	private ArrayList<Pack> packagePurchaseds = new ArrayList<Pack>();
	
	
	public Client(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public ArrayList<Pack> getPackagePurchaseds() {
		return packagePurchaseds;
	}

	public void setPackagePurchaseds(ArrayList<Pack> packagePurchaseds) {
		this.packagePurchaseds = packagePurchaseds;
	}

	public void addPackagePurchased(Pack pack) {
		this.getPackagePurchaseds().add(pack);
	}

	public void buyPack(Pack pack) throws ExceptionNotMoney {
		double packPrice = pack.calculatePrice(this);
		if (this.getMoney() >= packPrice) {
			this.setMoney(this.getMoney() - packPrice);
			this.addPackagePurchased(pack);
		} else {
			throw new ExceptionNotMoney("saldo insuficiente");
		}
	}

	public int manyPackagePurchased() {
		return this.getPackagePurchaseds().size();
	}

	public double spendPackagePurchased() {
		double spend = 0;
		for (Pack pack : this.getPackagePurchaseds()) {
			spend = spend + pack.calculatePrice(this);
		}
		return spend;
	}

	public Pack moreExpensivePackaged() {
		double maxPrice = 0;
		Pack packaged = new Pack();
		for (Pack pack : this.getPackagePurchaseds()) {
			if (maxPrice < pack.calculatePrice(this)) {
				maxPrice = pack.calculatePrice(this);
				packaged = pack;
			}
		}
		return packaged;

	}
}
