
public class NumberToWords {
	
	public static void numberToWords(int number) {
		if(number < 0) System.out.print("Invalid Value");
		
		int count = 0;
		int digitsOfNumber = getDigitCount(number); // returns how many digits the number contains
		
		number = reverse(number);
		
		while (number > 0) {
			
			switching(number%10);

			number /= 10;
			count++;
			
		}// end of while number > 0	
		
		if(digitsOfNumber > count) {
			for ( int i = 0; i < (digitsOfNumber - count); i++) {
				System.out.print("Zero ");
			}
		}
		System.out.println();
		
	}// end of the method
	
	public static int reverse(int parameter) {
		
		int reversedNumber=0;
		
		while(parameter != 0) {
			int reverse = parameter % 10;
			reversedNumber *= 10;
			reversedNumber += reverse;
			parameter /= 10;	
		}
		return reversedNumber;
	}
	
	public static int getDigitCount(int number) {
		
		if (number<0) return -1;
		
		int count=0;
		
		do {
			count++;
			number /= 10;
		}while(number > 0);
		
		return count;
	}

	public static void switching(int number) {
		switch (number){
        case 0:
            System.out.print("Zero ");
            break;
        case 1:
            System.out.print("One ");
            break;
        case 2:
            System.out.print("Two ");
            break;
        case 3:
            System.out.print("Three ");
            break;
        case 4:
            System.out.print("Four ");
            break;
        case 5:
            System.out.print("Five ");
            break;
        case 6:
            System.out.print("Six ");
            break;
        case 7:
            System.out.print("Seven ");
            break;
        case 8:
            System.out.print("Eight ");
            break;
        case 9:
            System.out.print("Nine ");
            break;
		} // end of switch
	}

}
