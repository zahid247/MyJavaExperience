public class Main {
	public static void main(String args[]) {
		
//		Hamburger hamburger = new Hamburger("Italian", "Chicken", true);
//		System.out.println("$" + hamburger.getBasePrice());
//		System.out.println("$" + hamburger.getFinalPrice());
//		
		
//		HealthyHamburger healthyBurger = new HealthyHamburger("chicken");
//		healthyBurger.addItemsForHealthy();
//		
//		System.out.println(healthyBurger.getBreadType());
//		System.out.println(healthyBurger.getBasePrice());
//		System.out.println(healthyBurger.getFinalPrice());
		
		DeluxeHamburger del = new DeluxeHamburger();
		System.out.println(del.getBasePrice());
		System.out.println(del.getFinalPrice());
	}
}
