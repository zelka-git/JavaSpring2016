package classwork160405;

import java.util.Arrays;

public class RangeDetectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Usage: EvenOddExample <number>");
			System.exit(0);
		}
		String argsList = Arrays.toString(args);
		System.out.println(argsList);
		
		int x = Integer.parseInt(args[0]);
		
		/*
		 * если ч между 10 и 20 включительно - напечатать ПОПАЛ
		 * иначе если < 10 и >2 0- напечатать МИМО
		 */
		if ( x >= 10 && x <=20) {
			System.out.println("ПОПАЛ");
		}else {
			System.out.println("МИМО");
		}
			
	}

}
