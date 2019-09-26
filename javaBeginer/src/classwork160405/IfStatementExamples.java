package classwork160405;

public class IfStatementExamples {
	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		if (x < y)
			System.out.println("Less than");
		else
			System.out.println("Greater than");
		
		boolean isLessThan = x < y;
		
		if (x < y) {
			System.out.println("I have checked x and y:");
			System.out.println("Less than");
			
		}
		else
			System.out.println("Greater than");
	}
}
