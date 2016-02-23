package model;

import abstracts.Client;
import interfaces.StrategyPackages;
import strategys.FixedStrategy;
import strategys.StrategyClientMoney;
import strategys.StrategyRoom;

public class Pack {

	private double basePrice;
	private double tax;
	private StrategyPackages strategy;
	private double rest;

	public Pack() {
		super();
	}

	public Pack(double tax) {
		this.tax = tax;
		this.strategy = new StrategyClientMoney();
	}

	public Pack(double basePrice, double tax) {
		this.basePrice = basePrice;
		this.tax = tax;
		this.strategy = new FixedStrategy();
	}

	public Pack(double basePrice, double tax, int rooms) {
		this.basePrice = basePrice;
		this.tax = tax;
		this.strategy = new StrategyRoom(rooms);
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public StrategyPackages getStrategy() {
		return strategy;
	}

	public void setStrategy(StrategyPackages strategy) {
		this.strategy = strategy;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getRest() {
		return rest;
	}

	public void setRest(double rest) {
		this.rest = rest;
	}

	public double calculatePrice(Client client) {
		if (this.getBasePrice() == 0.0) {
			this.setBasePrice(client.getMoney());
		}
		return this.getStrategy().calculatePrice(this.getBasePrice(), this.getTax());
	}
}
