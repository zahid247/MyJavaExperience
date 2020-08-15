public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal){
		 
        int remainder = (goal % 5);
        int sum = (smallCount + (bigCount * 5));
 
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0) || (sum < goal)) return false;
 
        if ((remainder <= smallCount) && (remainder >=0)) return true;
        
        return false;
    }
}