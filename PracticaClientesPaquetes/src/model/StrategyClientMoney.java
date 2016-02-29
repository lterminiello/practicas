package model;

import interfa.StrategyPackages;

public class StrategyClientMoney implements StrategyPackages{

	public StrategyClientMoney() {
		super();
	}

	@Override
	public double calculatePrice(double basePrice, double tax, Client client) {
		return (client.getMoney() * 0.10) * tax;
	}

	
}
