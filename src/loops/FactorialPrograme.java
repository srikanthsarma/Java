package loops;

import java.util.Scanner;

public class FactorialPrograme {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long factorial = N;
		for(int i = N; i >= 1; i--) {
			factorial = factorial*i;	
		}
		System.out.println(factorial);
		sc.close();
		
		
	}

}
