package automobile;

public class Vehicle {
	
	private int tires;
	private int speed;
	private String steering;
	
	public Vehicle() {
		this (0, 0);
	}
	public Vehicle(int tires, int speed) {
		this (tires, speed, "Steering Wheel");
	}
	public Vehicle(int tires, int speed, String steering) {
		this.tires = tires;
		this.speed = speed;
		this.steering = steering;
	}
	public int getTires() {
		return tires;
	}
	public void setTires(int tires) {
		this.tires = tires;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getSteering() {
		return steering;
	}
	public void setSteering(String steering) {
		this.steering = steering;
	}
	
	public int increse(int speed) {
		return this.speed += speed;
	}
	
	public int decrease(int speed) {
		return this.speed -= speed;
	}

}
