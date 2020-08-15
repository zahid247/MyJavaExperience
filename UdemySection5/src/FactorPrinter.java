
public class FactorPrinter {
	
	public static void printFactors(int number) {
		
		if (number < 1) System.out.println("Invalid Value");
		
		for(int i = number; i > 0; i--) {
			if (number % i == 0) System.out.print(number / i + " ");
		}
		System.out.println();
	}

}
