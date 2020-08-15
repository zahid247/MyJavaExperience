import java.util.Scanner;
public class Hamburger {

	private String breadType;
	private String meat;
	public double lettuce = 1;
	public double tomato = 1;
	public double mayo = 0.5;
	public double bacon = 2;
	public double carrot = 1;
	public double ketchup = 0.5;
	public double basePrice = 5;
	public boolean adding;
	public double finalPrice = basePrice;
	
	public Hamburger(String breadType, String meat) {
		this.breadType = breadType;
		this.meat = meat;
	}// end of the constructor

	public void addItems() {
				
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		
		while(count < 4) {
			
			System.out.println("Type 1 to confirm for adding:");
			System.out.println("Type 2 to finish editing the burger.");
			
			int edit = input.nextInt();
			input.nextLine(); // grabbing enter key
			
			if (edit == 1) {
				
				System.out.println("Select items: ");
				System.out.println("Lettuce, tomato, carrot = +$1 for each."
						+ "\nMayo, Ketchup = +$0.5."
						+ "\nBacon = +$2.");
				
				String selectAddition = input.nextLine();
				
				switch(selectAddition.toLowerCase()) {
					case "lettuce":
						this.finalPrice += this.lettuce;
						break;
					case "tomato":
						this.finalPrice += this.tomato;
						break;
					case "mayo":
						this.finalPrice += this.mayo;
						break;
					case "bacon":
						this.finalPrice += this.bacon;
						break;
					case "carrot":
						this.finalPrice += this.carrot;
						break;
					case "ketchup":
						this.finalPrice += this.ketchup;
						break;	
					default:
						break;
				}//end of the switch statement
				count++;
			} else {
				break;
			}
		}//end of the while (count < 4)
	
		input.close();
	
	}//end of the addItems

	//getters
	public String getBreadType() {
		return breadType;
	}

	public String getMeat() {
		return meat;
	}

	public double getLettuce() {
		return lettuce;
	}

	public double getTomato() {
		return tomato;
	}

	public double getMayo() {
		return mayo;
	}

	public double getBacon() {
		return bacon;
	}

	public double getCarrot() {
		return carrot;
	}

	public double getKetchup() {
		return ketchup;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public boolean isAdding() {
		return adding;
	}

	public double getFinalPrice() {
		return finalPrice;
	}
		
}//end of the class
