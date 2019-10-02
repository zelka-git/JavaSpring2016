package classwork160512;

public class Recursion {
	public static void main(String[] args) {
		a();
		d(0);
	}
	
	static void d(int depth) {
		System.out.println("depth = " + depth++);
		d(depth);
	}

	private static void a() {
		// TODO Auto-generated method stub
		System.out.println("a");
		b();
	}

	private static void b() {
		// TODO Auto-generated method stub
		System.out.println("b");
		c();
	}

	private static void c() {
		// TODO Auto-generated method stub
		System.out.println("c");
		new Exception().printStackTrace();
	}
}
