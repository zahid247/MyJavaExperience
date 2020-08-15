public class DiagonalStar {
	public static void printSquareStar(int number){
	      
		if(number < 5) {
		System.out.println("Invalid Value");
		} else {
	        for (int i = 1; i <= number; i++) {
	            for (int j = 1; j <= number; j++) {
	                if (i == j || i == 1 || j == 1 || i == number || j == number || i == number -j + 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }// end of nested for loop
	            System.out.println();
	        }// end of for loop
		}// end of first if
    }// end of method
}
