package vjezbe_5.z04;


public final class Netbook extends Laptop {

	public Netbook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
		super(model, manufacturer, operatingSystem, batteryCapacity, weight);
	}
	
	@Override
	public String getComputerType() {
		return "netbook " + super.getComputerType();
	}

	@Override
	public int calculatePortabilityScore() {
		return 1;
	}

}
