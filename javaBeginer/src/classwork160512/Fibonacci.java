package classwork160512;

public class Fibonacci {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		fibs = new long[51];
		long f = fib(30);
		long stop = System.currentTimeMillis();
		System.out.println(f);
		System.out.println("elapsed = " + (stop - start));
		start = System.currentTimeMillis();
		System.out.println(fibM(20));
		stop = System.currentTimeMillis();
		System.out.println("elapsed = " + (stop - start));
	}
	static long[] fibs;
	
	private static long fib(int n) {
		// TODO Auto-generated method stub
		if ( n == 0) {
			return 0;
		}
		if ( n == 1) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}

	private static long fibM(int n) {
		// TODO Auto-generated method stub
		if ( n == 0) {
			return 0;
		}
		if ( n == 1) {
			return 1;
		}
		if (fibs[n] == 0) {
			fibs[n] = fibM(n-1) + fibM(n-2);
		} 
		return fibs[n];
	}
}
