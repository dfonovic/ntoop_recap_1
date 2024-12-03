package vjezbe_4.z05;

import vjezbe_4.z04.Vehicle;

public class Car extends Vehicle {

	private String carType;

	public Car(String regNo, String model, int year, double price, String carType) {
		super(regNo, model, year, price);
		this.carType = carType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

}
