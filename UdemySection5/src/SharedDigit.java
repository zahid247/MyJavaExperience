
public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) { //12, 23
    	if ( first < 10 || first > 99 || second < 10 || second > 99) {
    		return false;
    	}
    	
    	int temp1 = first;                          
    	int temp2 = second;                         
    	
    	while(temp1 > 0) {  
    		if((temp1 % 10) == (temp2 % 10)) {      
    			return true;                       
    		}
    		
    		temp2 = second;  
    		
    		while(temp2>0) {                        
    			if((temp1 % 10) == (temp2 % 10)) { 
    				return true;                   
    			}
    			temp2 /= 10;                        
    		}
    		temp1 /= 10;                           
    	}
    	return false;
    }// end of the method	
    
    public static boolean hasSharedDigitMine(int num1, int num2){
        if ( num1<10 || num1>99 || num2<10 || num2>99 ) {
            return false;
        }

        int temp1 = num1, temp2 = num2;

        while (temp1>0){
            int lastDigitNum1 = temp1%10;
            temp1 /= 10;
            while (temp2>0){
                int lastDigitNum2 = temp2%10;
                temp2 /= 10;
                if (lastDigitNum1 == lastDigitNum2){
                    return true;
                }
            }
            temp2 = num2;
        }
        return false;
    }
}//end of the class
