package classwork160512;

public class CycleByRecursion {
	public static void main(String[] args) {
			print(10);
			print2(0, 10);
	}

	private static void print2(int i, int n) {
		if (i >= n) {
			return;
		}
		System.out.println(i);
		print2(i+1, n);//tail recursion
	}

	private static void print(int i) {
		// TODO Auto-generated method stub
			if(i > 0) {
				print(i-1);
				System.out.println(i - 1);
			}
	}

}
