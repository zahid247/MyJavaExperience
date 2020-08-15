import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void minAndMaxCalculator() {
		
		Scanner input = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(true) {
			
			System.out.println("Enter number: ");
			
			boolean isInt = input.hasNextInt();
			
			if(!isInt) break;
			
			int number = input.nextInt();
			
			if (number > max) max = number;
			
			if (number < min) min = number;
			
			
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = "+ min);
	
		input.close();
		
	}
	
}
