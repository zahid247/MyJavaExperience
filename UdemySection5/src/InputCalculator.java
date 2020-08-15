import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int averageCounter = 0;
		
		while(true) {
			
			boolean isAnInt = input.hasNextInt();
			
			if (isAnInt) {
				
				int number = input.nextInt();
				sum += number;
				averageCounter++;
				
			} else {
				break;
			}//end of if statement
			
			input.nextLine();
		}// end of while loop
		long average = Math.round((double)sum/averageCounter);
		
		System.out.println("SUM = " + sum + " AVG = " + average);
		
		input.close();
	}//end of method
}
