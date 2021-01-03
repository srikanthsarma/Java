package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
	 /*	Note: bitwise operator works on binary values	*/
		
		int a = 5; // a --> 101
		int b = 4; // b --> 100
		
//		Bitwise Operations
		System.out.println("OR operator : " + (a|b));
		System.out.println("AND operator : " + (a&b));
		System.out.println("Complement operator : " + (~a));
		System.out.println("XOR operator : " + (a^b));
		System.out.println("RightShift operator : " + (a >> 1));
		System.out.println("LeftShift operator : " + (a << 1));
		System.out.println("Unsigned rightShift  : " + (a >>> 1));
	
	
	
	
	}

}
