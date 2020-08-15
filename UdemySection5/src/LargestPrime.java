
public class LargestPrime {
	
public static int getLargestPrime(int number){
        
		if (number < 2) return -1;
        
        int findPrime = 0;
        
        for (int i = number; i >= 2; i--) {
        	
        	if (number%i==0) {
        		
        		findPrime += i;
        		
        		for (int j = findPrime-1; j >= 2;j--) {
        			if (findPrime%j==0) {
        				findPrime = 0;
        				findPrime += j;
        			}//end of the if under nested for
        		}//end of the nested for loop
        		return findPrime;
        	}//end of the if
        }//end of the first for loop
        return findPrime;
    }//end of the method
}
