package classwork160505;

public class PassByValue {
	public static void main(String[] args) {
		int x = 10;
		x = incrementBy10(x);//фактический параметр
		System.out.println(x);
	}

	private static int incrementBy10(final int x) { //формальный параметр
		// TODO Auto-generated method stub
		//final int myVar = 210;
//		x = x + 10; ERROR!
		System.out.println(x);
		return x + 10;
	}
}
