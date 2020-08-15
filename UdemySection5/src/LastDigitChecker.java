
public class LastDigitChecker {
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
			return false;
		}
		
		int a = getLastDigit(num1);
		int b = getLastDigit(num2);
		int c = getLastDigit(num3);
		
		if((a==b) || (a==c) || (b==c)) {
			return true;
		}else return false;
	}
	
	public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }else return true;
    }
	
	public static int getLastDigit(int number) {
		return number%10;
	}

}
