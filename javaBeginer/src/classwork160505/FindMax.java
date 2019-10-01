package classwork160505;

public class FindMax {
	public static void main(String[] args) {
		
		int[] a = {10, 30, -20, 90, 40, 2};
		
		int m = findMaxElementIndex(a);
		
		System.out.println(a[m] + m);
	}

	private static int findMaxElementIndex(int[] a) {
		// TODO Auto-generated method stub
		if (a == null) {
			return -1;
		}
		if(a.length == 0 ) {
			return -1;
		}
		int maxValue = Integer.MIN_VALUE;
		int indexofElementWithMaxValue = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[indexofElementWithMaxValue]) {
				indexofElementWithMaxValue = i;
			}
		}
		
		return indexofElementWithMaxValue;
	}
}
