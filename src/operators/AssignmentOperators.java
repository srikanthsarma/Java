package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int a = 5;
/*	Note : " = " is also an assignment operator which assigns the value to variable		*/
		
//		Assignment Operations
		
		System.out.println("+= --> " + (a += 4));	// I.E; a = a + 4
		System.out.println("-= --> " + (a -= 4));	// I.E; a = a - 4
		System.out.println("*= --> " + (a *= 4));	// I.E; a = a * 4
		System.out.println("/= --> " + (a /= 4));	// I.E; a = a / 4
		System.out.println("%= --> " + (a %= 4));	// I.E; a = a % 4
		System.out.println("|= --> " + (a |= 4));	// I.E; a = a | 4
		System.out.println("&= --> " + (a &= 4)); 	// I.E; a = a & 4
		System.out.println("^= --> " + (a ^= 4)); 	// I.E; a = a ^ 4
		System.out.println(">>= --> " + (a >>= 4));	// I.E; a = a >> 4
		System.out.println("<<= --> " + (a <<= 4)); // I.E; a = a << 4

/*	Note: the value of a is changing after each operation	*/		
	
	}

}
