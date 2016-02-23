package strategys;

import interfaces.StrategyPackages;

public class StrategyClientMoney implements StrategyPackages{

	public StrategyClientMoney() {
		super();
	}

	@Override
	public double calculatePrice(double basePrice, double tax) {
		return (basePrice * 0.10) * tax;
	}

	
}
