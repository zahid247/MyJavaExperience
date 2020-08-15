
public class EvenDigitSum {
	
	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		
		int sum = 0;
		
		while (number > 0) { 
			
			int findEvenNum = number % 10;
			number /= 10;
			
			while ((findEvenNum%2) == 0) {
				sum += findEvenNum;
				break;
			}//end of the nested while
		}//end of the first while
		return sum;
	}//end of the method
}// end class
