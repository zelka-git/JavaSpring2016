package lesson160317;


public class ShiftExamples {
	public static void main(String[] args) {
		System.out.println(1 << 2);
		System.out.println(256 >> 3);
		System.out.println(-1);
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(-1).length());
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(-2).length());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

		System.out.println(Integer.MAX_VALUE << 1);
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.toBinaryString(Long.MAX_VALUE));
	}
}
