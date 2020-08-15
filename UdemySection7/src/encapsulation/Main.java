package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Printer print = new Printer(100, true);
		print.printDocuments(20);
		
		
		Printer print2 = new Printer(50, true);
		print2.fillToner(30);
		System.out.println(print2.getTonerLevel());
	}

}
