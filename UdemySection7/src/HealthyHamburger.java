import java.util.Scanner;

public class HealthyHamburger extends Hamburger {
		
	public HealthyHamburger(String meat) {
		super("Brown rye roll", meat);
	}

	public void addItemsForHealthy() {
				
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		
		while(count < 6) {
			
			System.out.println("Type 1 to confirm for adding:");
			System.out.println("Type 2 to finish editing the burger.");
			
			int edit = input.nextInt();
			input.nextLine(); //grabbing enter key
			
			if (edit == 1) {
				
				System.out.println("Select items: ");
				System.out.println("Lettuce, tomato, carrot = +$1 for each."
						+ "\nMayo, Ketchup = +$0.5."
						+ "\nBacon = +$2.");
				
				String selectAddition = input.nextLine();

				switch(selectAddition.toLowerCase()) {
					case "lettuce":
						super.finalPrice += super.lettuce;
						break;
					case "tomato":
						super.finalPrice += super.tomato;
						break;
					case "mayo":
						super.finalPrice += super.mayo;
						break;
					case "bacon":
						super.finalPrice += super.bacon;
						break;
					case "carrot":
						super.finalPrice += super.carrot;
						break;
					case "ketchup":
						super.finalPrice += super.ketchup;
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
		
}
