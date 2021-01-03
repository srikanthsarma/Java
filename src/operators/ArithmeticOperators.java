package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
//		Variables
		int a = 10, b = 5;
		
//		Arithmetic operations
		System.out.println("Sum : " + (a+b));
		System.out.println("Difference : " + (a-b));
		System.out.println("Product : " + (a*b));
		System.out.println("Quotient : " + (a/b));
		System.out.println("Remainder : " + (a%b));
		System.out.println("Increment : " + ++a); // a = 11 
		/*	Note: if "a++" is used the increment will be in the next line	*/ 
		System.out.println("Decrement : " + --b);//b = 4
		/*	Note: if "a--" is used the decrement will be in the next line	*/ 

		}

}
