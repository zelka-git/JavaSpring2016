package classwork160411;

public class ContinueExamples {
	public static void main(String[] args) {
		int x = 1_000_000;
		for(;;) {
			if(x % 5 == 0) {
				System.out.println(x);
				x -= 1001;
				continue;
			}
			x--;
			if ( x < 0) {
				break;
			}
		}
		
		
		int[][] matrix = {
				{1 ,2, 0, 0, 5},	
				{6, 7, 0, 9, 10},	
				{11, 12, 13, 14},	
		};
		System.out.println("-----");
		OUTER:
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == 0) {
					System.out.println(row);
//					break;
					continue OUTER;
				}
			}
		}
	}
}
