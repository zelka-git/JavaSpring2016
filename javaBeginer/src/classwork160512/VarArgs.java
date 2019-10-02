package classwork160512;

public class VarArgs {
	public static void main(String... args) {
		if(args.length == 0) {
			System.out.println("Usage .....");
			System.exit(0);
		}
		for (String argument : args) {
			System.out.println(argument);
		}
		//call static helper method
		helper();
		helper(1, 2, 3);
		helper(1, 2, 3, 4);
	}
	//method overload
//	private static void helper(int i, int j, int k) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void helper(int i, int j, int k, int l) {
//		// TODO Auto-generated method stub
//		
//	}

	static void helper(int... a) {
//		System.out.println("Helper:");
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println("-----");
	}
	static void helper(String s, float f, double d) {
		
	}
}
