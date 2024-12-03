package vjezbe_5.z04;


public class Device {
	//ova klasa ne mora biti abstract!

	private String model;
	private String manufacturer;
	
	public Device(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return model + ", manufacturer=" + manufacturer;
	}
	
}
