package polymorphism;

public class Main {

	public static void main(String args[]) {
		
		Car car = new Car("Car", 4);
		car.accelerate();
		car.brake();
		car.startEngine();
		System.out.println();
		Lancer lancer = new Lancer("Car", 4);
		lancer.accelerate();
		lancer.brake();
		lancer.startEngine();
		System.out.println();
		Passat passat = new Passat("Car", 4);
		passat.accelerate();
		passat.brake();
		passat.startEngine();
		
	}
	
}

class Car {
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	
	public Car (String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.engine = true;
	}

	public String getName() {
		return name;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}
	
	public void startEngine() {
		System.out.println("Car -> engine is started.");
	}
	
	public void accelerate() {
		System.out.println("Car -> car accelerated.");
	}
	
	public void brake() {
		System.out.println("Car -> brakes.");
	}
}

class Lancer extends Car {
	
	public Lancer(String name, int cylinders) {
		super(name, cylinders);
	}

	public void startEngine() {
		System.out.println(getClass().getSimpleName() + " -> engine is started.");
	}
	
	public void accelerate() {
		System.out.println(getClass().getSimpleName() + " -> car accelerated.");
	}
	
	public void brake() {
		System.out.println(getClass().getSimpleName() + " -> brakes.");
	}
}

class Passat extends Car {
	
	public Passat(String name, int cylinders) {
		super(name, cylinders);
	}

	public void startEngine() {
		System.out.println(getClass().getSimpleName() + " -> engine is started.");
	}
	
	public void accelerate() {
		System.out.println(getClass().getSimpleName() + " -> car accelerated.");
	}
	
	public void brake() {
		System.out.println(getClass().getSimpleName() + " -> brakes.");
	}
}























