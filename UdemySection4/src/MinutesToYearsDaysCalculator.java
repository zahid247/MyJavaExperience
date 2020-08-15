
public class MinutesToYearsDaysCalculator {
	
	private static final int minutesInDay = 1440; //(24*60)
	private static final int daysInYear = 365;
	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes < 0) {
			System.out.println("Invalid Value");
			
		} else {
			
		long days = minutes / minutesInDay;
		
		long years = days / daysInYear;
		long remainingDays = days % daysInYear;
		
		System.out.println(minutes + " min = " + years + " year(s) and " + remainingDays + " day(s).");
		
		}
	}
}
