package automobile;

public class Evo extends Car {
	
	private boolean turbo;
	
	public Evo(int tires, int speed, String steering, String gears, boolean turbo) {
		super(tires, speed, steering, gears);
		this.turbo = turbo;
	}
	public Evo(int tires, int speed) {
		super(tires, speed);
		this.turbo = true;
	}
	public Evo() {
		super();
		this.turbo = true;
	}
	
	public void setTurbo(boolean turbo) {
		this.turbo = true;
	}
	public boolean getTurbo() {
		return this.turbo;
	}

	
}
