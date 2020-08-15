
public class LeapYear {
	
	public static boolean isLeapYear(int year) {
		
		if (year < 1 || year > 9999) {
			return false;
		} else { // if true continue
			
			if (year%4 == 0) { 
				
				if (year%100 == 0) {
					
					if(year%400 == 0) {
						
						return true;
						
					} else {
						
						return false;//3rd step
						
					}
					
				} else {
					
					return true;//2nd step
					
				}
				
			} else {
				
				return false;//1st step
				
			}
			
		}//end of the 1st if
		
	}
}
