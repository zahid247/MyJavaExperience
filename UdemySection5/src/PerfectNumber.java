public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;
        
        int digit=0;
        int sum =0;
        int i=2;
        
        while(i <= number) {
        	
        	if (number%i == 0) {
        		digit = number / i;
        		sum += digit;
        	}
        	
        	i++;
        }
        
        return sum == number;
        
    }
}