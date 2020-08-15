package composition;

public class TV {
	
	private int size;
	private String model;
	private String manufacturer;
	
	public TV(String manufacturer, String model, int size) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.size = size;
	}

	private int getSize() {
		return this.size;
	}

	private String getModel() {
		return this.model;
	}

	private String getManufacturer() {
		return this.manufacturer;
	}
	
	public void turnTV(int p) {
		if(p==1) {
			System.out.println("The TV is on.");
		}else System.out.println("The TV is off");
	}

	public void tvInfo() {
		System.out.println("Size = " + getSize());
		System.out.println("Model = " + getModel());
		System.out.println("Manufacturer = " + getManufacturer());
	}

}
