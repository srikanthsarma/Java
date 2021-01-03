package loops;

public class LoopsExample {

	public static void main(String[] args) {
		
//		For loop example
		for(int i = 0; i < 5; i++) {
			System.out.println("this is a for loop iteration " + (i+1));
		}
		
//		While loop example
		int i = 0;
		while(i < 5) {
			System.out.println("this is a while loop iteration " + (i+1));
			i++;
		}
		
//		do-while loop
		i  = 0;
		do {
			System.out.println("this is a do-while loop iteration " + (i+1));
			i++;
		}
		while(i < 5);
		
		
		
		
		
	}

}
