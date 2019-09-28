package classwork160425;

public class DoubleX {
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Usege: DoubleX <some string with possible x>");
			System.exit(1);
		}
		System.out.println(doubleX(args[0]));
//		System.out.println(doubleX(null));
//		System.out.println(doubleX(""));
//		System.out.println(doubleX("x"));
//		System.out.println(doubleX("ax"));
//		System.out.println(doubleX("xx"));
//		System.out.println(doubleX("ax"));
	}
	
	static boolean doubleX(String str) {
		  if (str == null) {
			return false;
		}
		  int xIndex = str.indexOf('x');
		  if (xIndex < 0){
		    return false;
		  }
		  if (xIndex >= str.length() - 1){
		    return false;
		  }
		  if (str.length() == 1) {
			return false;
		}
		  return str.charAt(xIndex + 1) == 'x';
		  
		}
}
