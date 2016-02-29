package sale;

import javax.rmi.CORBA.Util;

import utils.Tools;

public class Package {

	private int cant;
	private float price;
	private String cod;
	private int discout;
	
	public Package(int cant, float price, String cod) {
		super();
		this.cant = cant;
		this.price = price;
		this.cod = cod;
	}

	public String calculated(){
		return "";
	}
	
	

	public int getDiscout() {
		return discout;
	}

	private void setDiscout() {
		float totalPrice;
		totalPrice = cant * price;
		if(Tools.isBetween(totalPrice, 1000, 5000)){
			this.discout = 3;
		} else {
			
		}
		
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
	
}
