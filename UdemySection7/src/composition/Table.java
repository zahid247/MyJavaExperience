package composition;

public class Table {
	
	private int tableChairs;

	public Table(int tableChairs) {
		this.tableChairs = tableChairs;
	}

	public int getTableChairs() {
		return tableChairs;
	}
	
	public void isTableBig(boolean c) {
		if(c) {
			System.out.println("The table is big enough.");
		}else System.out.println("The table is bad.");
	}

}
