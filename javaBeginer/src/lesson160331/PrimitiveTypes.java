package lesson160331;

import com.sun.jdi.CharType;

public class PrimitiveTypes {
	public static void main(String[] args) {
		byte b = 1; // 8 bit == 1 byte
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		short s = 23; //16 bits == 2 bytes
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		int i = 10; // 32 bit == 4 bytes
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		long r = 1L; //64 bit == 8 bytes
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	
		char t = 0; // 16 bits == 2 byte
		System.out.println();
		
		float p = 1.2f; // 32 bits == 4 bytes
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		double o = 6.9;// 64 bits == 8 bytes
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		boolean w =true;
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
	}
}
