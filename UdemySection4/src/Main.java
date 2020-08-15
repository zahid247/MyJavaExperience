
public class Main {

	public static void main(String[] args) {
		
		System.out.println(LeapYear.isLeapYear(2020));//checking if the year is a leap year or not
		IntEqualityPrinter.printEqual(5,5,5);
		System.out.println(EqualSumChecker.hasEqualSum(5, 5, 10));
		DecimalComparator.areEqualByThreeDecimalPlaces(24, 25);
		System.out.println(AreaCalculator.area(5));//circle
		System.out.println(AreaCalculator.area(5,10));//rectangular
		System.out.println(BarkingDog.shouldWakeUp(true, 7));
		MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
		MinutesToYearsDaysCalculator.printYearsAndDays(555555);
		System.out.println(PlayingCat.isCatPlaying(true, 65));
		SpeedConverter.printConversion(100);
		System.out.println(TeenNumberChecker.hasTeen(19, 35, 55));//there is a teenager in the group
		
	}

}
