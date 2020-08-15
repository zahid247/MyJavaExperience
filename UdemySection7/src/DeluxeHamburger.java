
public class DeluxeHamburger extends Hamburger{
	
	private String chips = "Chips";
	private String drink = "Drink";
	private double price = 10;
	private double finalPrice;
	
	public DeluxeHamburger() {
		super("Deluxe bread", "Deluxe meat");
		this.finalPrice = super.basePrice + price;
	}
	
	
	
	
	public String getChips() {
		return chips;
	}
	
	public String getDrink() {
		return drink;
	}

	public double getPrice() {
		return price;
	}

	public double getFinalPrice() {
		return finalPrice;
	}
	
	
	

}
