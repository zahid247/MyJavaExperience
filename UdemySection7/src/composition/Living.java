package composition;

public class Living {
	
	private Room size;
	private Table table;
	private TV tv;
	
	public Living(Room size, Table table, TV tv) {
		this.size = size;
		this.table = table;
		this.tv = tv;
	}

	private Room getSize() {
		return this.size;
	}

	private Table getTable() {
		return this.table;
	}

	private TV getTv() {
		return this.tv;
	}
	
	private void lights(int i) {
		if (i==1) {
			size.turnOnLights();
		}else System.out.println("The lights are off.");
	}
	
	public void enterLiving() {
		lights(1);
		tv.turnTV(1);
	}
	
	public void aboutTheLivingRoom() {
		System.out.println("The size of the room is around " + (int)getSize().getArea() + " square feet.");
		System.out.println("The table has " + getTable().getTableChairs() + " chairs.");
		System.out.println("The info about the TV is here: ");
		getTv().tvInfo();
	}

}
