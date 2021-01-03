package loops;

import java.util.Scanner;

public class FibonacciSeriesExample {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0 , b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i = 2; i < N; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			
		}
		sc.close();
	

	}

}
