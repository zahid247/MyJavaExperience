package encapsulation;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted = 0;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel > 100) {
			this.tonerLevel = 100;
		}else this.tonerLevel = tonerLevel;
		
		this.duplex = duplex;
	}
	
	public int getTonerLevel() {
		return this.tonerLevel;
	}
	
	public int fillToner(int addToner) {
		if(addToner < 0 || addToner > 100) {
			return -1;
		}else {
			if(addToner + this.tonerLevel > 100) {
				this.tonerLevel = 100;
			}else this.tonerLevel += addToner;
		}
		return this.tonerLevel;
	}
	
	public void printDocuments(int pages) {
		if(this.duplex) {
			this.pagesPrinted = ((pages/2) + (pages%2));
		}else this.pagesPrinted = pages;
		
		System.out.println("Pages printed = " + this.pagesPrinted);
	}

}
