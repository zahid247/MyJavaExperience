
public class FirstLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {
		
		if (number < 0) {
			return -1;
		}
		
		int reverse = 0;
		int firstNum;
		int lastNum = number%10;
		
		while(number != 0) { // 121, 12, 1
			int lastDigit = number % 10;
			reverse *= 10;
			reverse += lastDigit;
			number /= 10;
		}
	
		firstNum = reverse % 10;
		return firstNum + lastNum;	
		
	}
}
