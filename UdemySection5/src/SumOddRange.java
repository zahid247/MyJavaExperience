public class SumOddRange {
    
    public static boolean isOdd(int number){
        
    	if (number < 0){
            return false;
        }
    	
    	boolean check = number%2==0 ? false : true;
    	return check;

//		if i want to use the if statement, it is written below
//    	if ((number % 2) == 0) {
//        	return false;
//        }else return true;
//		end of if statement to check if the number is an odd one
    	
    }// end isOdd
 
 public static int sumOdd(int start, int end){
        
        int sum = 0;
        
        if (start < 0 || end < 0 || end < start){
            return -1;
        } else {
            for (int i = start; i <= end; i++){
                if (isOdd(i)) {
                	sum += i;
                }
            }
            return sum;
        }// end if/else statement
    }// end sumOdd
}// end class