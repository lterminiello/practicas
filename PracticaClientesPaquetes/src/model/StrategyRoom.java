package model;

import interfa.StrategyPackages;

public class StrategyRoom implements StrategyPackages{

	private int rooms;

	public StrategyRoom(int rooms) {
		super();
		this.rooms = rooms;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public double calculatePrice(double basePrice, double tax, Client client) {
		return (basePrice * rooms) * tax;
	}
	
	
}
