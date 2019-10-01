package classwork160505;

public class Methods {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		int[] a = {1, 3, 3, 4};
		printArray(a);
		
		int[] x = {2, 4, 6, 8, 10};
		printArray(x);
		
		int[] y = {3, 6, 9, 12, 15};
		printArray(y);
	}
	
	static void printArray(int[] a) {
		//TODO
		for (int element : a) {
			System.out.println(element);
		}
	}
}
