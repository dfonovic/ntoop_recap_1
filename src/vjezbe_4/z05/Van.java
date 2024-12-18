package vjezbe_4.z05;

import vjezbe_4.z04.Vehicle;

public class Van extends Vehicle {

	private double height;
	private short noOfSeats;
	
	public Van(String regNo, String model, int year, double price, double height, short noOfSeats) {
		super(regNo, model, year, price);
		this.height = height;
		this.noOfSeats = noOfSeats;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public short getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(short noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
}
