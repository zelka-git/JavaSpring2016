package lesson160404;

public class TypeCasting {
	public static void main(String[] args) {
//		int x = 1.3; ERROR!
		double d = 1;
		
		float f = 1.3f;
		int x = (int)1.3; //explicit type cast
		short s = (short)1921222;
		System.out.println(Integer.toBinaryString(1921222));
		System.out.println(Integer.toBinaryString((short)1921222));
		short x1 = 10;
		short y1 = 3;
		short z = (short)(x1 * y1);
	}
}
