package model;

import interfa.StrategyPackages;

public class FixedStrategy implements StrategyPackages{


	public FixedStrategy() {
		super();
	}

	@Override
	public double calculatePrice(double basePrice,double tax, Client client) {
		return basePrice * tax;
	}
	
	
}
