
public class GreatesCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
		if (first<10 || second<10) return -1;
		
		int maxNum = Math.max(first, second);
		int minNum = Math.min(first, second);
		int commonDivisor;
		
		while (true) {
			commonDivisor = maxNum % minNum;
			maxNum=minNum;
			minNum=commonDivisor;
			if (commonDivisor == 0) {
				return maxNum;
			}
		}	
	}
//	
//	public static int CommonDivisor(int first, int second) {
//		if (first < 10 || second < 10) return -1;
//		
//		int temp1 = first;
//		int temp2 = second;
//		int commonDivisor;
//		
//		if (temp1 > temp2) {
//			do {
//				commonDivisor = temp1 % temp2;
//				temp1 = temp2;
//				temp2 = commonDivisor;
//			}while (commonDivisor == 0); return temp1;
//		} else {
//			do {
//				commonDivisor = temp2 % temp1;
//				temp2 = temp1;
//				temp1 = commonDivisor;
//			}while (commonDivisor == 0); return temp2;
//		}
//	}
//	
	public static int CommonDivisorZ(int first, int second) {
		if (first < 10 || second < 10) return -1;
		
		int temp1 = first;
		int temp2 = second;
		int commonDivisor=1;
		
		if (temp1 > temp2) {
			
			while (commonDivisor !=0 ) {
				commonDivisor = temp1 % temp2;
				temp1 = temp2;
				temp2 = commonDivisor;
				if (commonDivisor == 0) {
					return temp1;
				}
			}
			return temp1;
		} else {
			while (commonDivisor !=0 ) {
				commonDivisor = temp2 % temp1;
				temp2 = temp1;
				temp1 = commonDivisor;
				if (commonDivisor == 0) {
					return temp2;
				}
			}
			return temp2;
		}
	}
}
