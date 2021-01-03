package conditionalStatements;

import java.util.Scanner;


public class ConditionalStatements {

	public static void main(String[] args) {
		int a = 5, b = 4, c = 6;
		
//		IF statement
		if(a > b) {
			System.out.println("a > b");
		}
		
//		IF-ELSE statement
		if(a > b) {
			System.out.println("a > b");
		}
		else {
			System.out.println("a < b");
		}
		
//		ELSE-IF statement 
		if(a > b) {
			System.out.println("a > b");

		}
		else if(a == b) {
			System.out.println("a = b");

		}
		else {
			System.out.println("a < b");

		}
		
//		Ternary operator [IF-THEN-ELSE]
		int MaxofAandB= a > b? a : b;
		System.out.println("MaxOfAandB is : " + MaxofAandB);
		
//		Nested IF-ELSE statements
		
		if(a > b) {
			if(a > c) {
				System.out.println("a is lager");
			}
			else {
				System.out.println("c is larger");
			}
		}
		else {
			if(b > c) {
				System.out.println("b is larger");
			}
			else {
				System.out.println("c is larger"); 
			}
		}
		
//		Nested Ternary operator
		int result = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("the largest od a,b,c is : " + result);
		
//		Switch-Case 
		Scanner sc = new Scanner(System.in);
		
		char operation = sc.nextLine().charAt(0);
		switch(operation) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid operator");
		}
		
		sc.close();
	}

}
