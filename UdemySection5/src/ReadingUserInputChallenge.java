import java.util.Scanner;
public class ReadingUserInputChallenge {
	
	public static void readingUserInput() {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int counter = 0;
		
		while(true) {
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");
			
			boolean isInt = input.hasNextInt();
			
			if (isInt) {
				
				int number = input.nextInt();
				counter++;
				sum += number;

				if(counter == 10) {
					break;
				}
			} else {
				System.out.println("Invalid Value");
			}
			
			input.nextLine();
			
		}
		
		System.out.println("Sum of the inputs is: " + sum);
		input.close();
	}	

}
