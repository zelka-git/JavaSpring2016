package lesson160404;

public class Logicaloperators {
	public static void main(String[] args) {
		
		int y = 5;
		
		boolean x = true | (y < 4);
		boolean x2 = true || (y < 4);
		System.out.println("x=" + x);
		boolean a = true;
		boolean b = false;
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		
//		if (x != null && x.getValue() < 5) {
//			//do something
//		}
	}
}
