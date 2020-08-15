
public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
		
		boolean check;
		
		if ((int)(a*1000) == (int)(b*1000)) {
			check = true;
		} else {
			check = false;
		}
		
		System.out.println(check);
		return check;
		
	}

}
