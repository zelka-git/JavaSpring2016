package classwork160411;

public class MoreForLoopExamples {
	 public static void main(String[] args) {
		int x = 0;
		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.println(x);
//		System.out.println(y);// ERROR - y is out of scope
//		System.out.println(x);// ERROR - z is out of scope
		
//		int t = 0; int p = 0;
//		for(t = 5, p = 4; p < 100 && t < 234; p++, t++) {
//			
//		}
		
//		for (int n = 10 ;;){
//			
//		}
//		for(;; x += 10) {
//			
//		}
		
		for(; x < 100 ; ) {
			
		}
	}
}
