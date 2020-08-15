
public class SumDigits {
	
	public static int sumDigits(int parameter) {
		
		if ( parameter < 10 ) {
			return -1;
		}
		
		int sum = 0;
		
		while ( parameter > 0) {
			int number = parameter % 10;
			sum += number;
			parameter /= 10;
		}
		return sum;
	}

}
