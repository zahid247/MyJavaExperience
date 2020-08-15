
public class NumberOfDaysInMonth {
	
	public static boolean isLeapYear(int year) {
		
		if(year < 1 || year > 9999) {
			return false;
		}else {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						return true;
					}else return false;//3rd stop
				}else return true;//2nd stop
			}else return false;//1st stop
		}//ending the else of the 1st if
		
	}//ends isLeapYear
	
	public static int getDaysInMonth(int month, int year) {
		
		if (month < 1 || month > 12 || year < 1 || year > 9999) {
			
			return -1;
			
		} else if(isLeapYear(year)){
			
			
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 2:
				return 29;
			default:
				return 30;
			}//end of switch
		
			
		} else {

			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 2:
				return 28;
			default:
				return 30;
			}//end of switch
			
		}
		
		
	}//end getDaysInMonth
	
	//Perfectly written code found on Udemy
    public static boolean isLeapYearPerfected(int year)
    {
        if(year>=1 && year<=9999)
            return (year%4==0 && (year%100!=0 || year%400==0));
        return false;
    }
    public static int getDaysInMonthPerfected(int month,int year)
    {
        if(month<1 || month>12 || year<1 ||year>9999)
            return -1;
        else
        {
            switch(month)
            {
              case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                        return 31;
            
              case 2:
                      return isLeapYearPerfected(year)?29:28;
 
              case 4:case 6:case 9:case 11:
                        return 30;
              default:
                        return -1;
            }
 
 
        }
    }

}

	
	
	

