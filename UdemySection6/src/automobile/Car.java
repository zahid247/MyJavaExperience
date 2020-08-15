package automobile;

public class Car extends Vehicle {
	
	private String gears;
	
	public Car(int tires, int speed, String steering, String gears) {
		super(tires, speed, steering);
		this.gears=gears;
	}
	public Car(int tires, int speed, String steering) {
		super(tires, speed, steering);
		this.gears = "Auto";
	}
	public Car(int tires, int speed) {
		super(tires, speed);
		this.gears = "Auto";
	}
	public Car() {
		super();
		this.gears = "Auto";
	}
	
	public void setGears(String gears) {
		this.gears = gears;
	}
	public String getGears() {
		return this.gears;
	}

}
