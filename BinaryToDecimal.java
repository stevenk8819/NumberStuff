import java.util.*; 
public class BinaryToDecimal {

	public static void main(String[] args) {
		
		System.out.println ("Binary to Decimal is 1"); 
		System.out.println ("Decimal to Binary is 2"); 
		
		Scanner in = new Scanner (System.in); 
		int i = in.nextInt(); 
		if (i == 1) {
			System.out.println ("Enter binary number:"); 
			System.out.println (binaryToDecimal(in.next())); 
		}
		if (i == 2) {
			System.out.println ("Enter decimal number:"); 
			System.out.println (decimalToBinary(in.next())); 
		}
		
		
	}
	
	

	public static long binaryToDecimal(String bin) {
		int count = 0; 
		long sum = 0; 
        for (int i = bin.length() - 1; i >= 0; i--) {
//        	System.out.println (bin.charAt(i)); 
            if (bin.charAt(i) == '1') {//if one, 2^ that power
                sum += Math.pow(2, count);
               
            }
            count++; 
        }
        return sum;	
	}
	
	public static String decimalToBinary(String decimal) {
		String bin = "";
		long dec = Long.parseLong(decimal); 
		while (dec > 0) {
			long remainder = dec % 2;
			if (remainder == 0) {
				bin += "0"; 
			}
			else {
				bin += (Long.toString(remainder));	
			}
			dec = dec / 2;
		}
//		return bin; 
		String ret = ""; 
		for (int i = bin.length() -1; i >= 0; i--) {
			ret += bin.charAt(i); 
		}
		return ret; 
	}

}


