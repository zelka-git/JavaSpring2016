package classwork160428;

public class ScalarProduct {
	public static void main(String[] args) {
		int[] x = {1, 2, 3};
		int[] y = {2, 2, 2};
		
		int scalar = scalar(x, y);
		System.out.println(scalar);
	}
	static int scalar(int[] a, int[] b) {
		if(a.length != b.length) {
			return Integer.MIN_VALUE;
		}
		int result = 0;
		for (int i = 0; i < b.length; i++) {
			result += a[i] * b[i];
		}
		return result;
	}
}
