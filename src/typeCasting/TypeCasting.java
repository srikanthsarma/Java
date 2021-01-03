package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Auto typeCasting example
		
		byte x = 10;
		int y = x;
		System.out.println("Auto typeCast example: " + x +"\n" + y);
		
		
		//Manual typeCasting example
		
		double pi = 3.14;
		int pie = (int)pi;
		System.out.println("Manual typeCast example: " + pi);
		System.out.println(pie);
	}

}
