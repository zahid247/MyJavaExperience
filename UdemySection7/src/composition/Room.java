package composition;

public class Room {

	private double length;
	private double width;
	
	public Room(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public void turnOnLights() {
		System.out.println("Lights are on.");
	}
	
	public double getArea() {
		return this.length * this.width;
	}		
}
