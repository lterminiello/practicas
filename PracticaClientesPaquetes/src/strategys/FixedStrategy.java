package strategys;

import interfaces.StrategyPackages;

public class FixedStrategy implements StrategyPackages{


	public FixedStrategy() {
		super();
	}

	@Override
	public double calculatePrice(double basePrice,double tax) {
		return basePrice * tax;
	}
	
	
}
