package userInput;

//Importing scanner class
import java.util.Scanner;

public class ScannerUserInputExample {

	public static void main(String[] args) {
		
//		Instantiating scanner object
		Scanner sc = new Scanner(System.in);
		
//		Taking user input
		int principleAmount = sc.nextInt();
		float intrestRate = sc.nextFloat();
		int time = sc.nextInt();
		
		double simpleIntrest = (principleAmount*intrestRate*time)/100;
		
//		printing output
		System.out.println("Simple Intrest is : " + simpleIntrest);
		
//		closing the scanner		
		sc.close();
		
	}

}
