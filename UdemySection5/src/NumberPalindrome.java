public class NumberPalindrome{
	
    public static boolean isPalindrome(int number){

        int tempNumber = number;
        int reverse = 0;

        while(number != 0){
            int digit = number%10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }
        return reverse == tempNumber ? true : false;
    }
}