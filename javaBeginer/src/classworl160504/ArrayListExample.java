package classworl160504;

import java.util.ArrayList;

public class ArrayListExample {
	 public static void main(String[] args) {
		int[] a;
		a = new int[10];
		ArrayList<Integer> intArray1 = new ArrayList<Integer>();
		ArrayList<Integer> intArray2 = new ArrayList<>();
		
		intArray1.add(10);
		intArray1.add(20);
		intArray1.add(30);
		intArray1.add(40);
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		System.out.println(intArray1.size());
		intArray1.add(40);
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		intArray1.add(0, 0);
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		intArray1.add(4, 35);
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		System.out.println(intArray1.size());
		intArray1.remove(5);
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		System.out.println(intArray1.size());
		int indexOf30 = intArray1.indexOf(30);
		intArray1.remove(indexOf30);
		
		intArray1.remove((Integer)20);
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		System.out.println(intArray1.size());
		
		
	}
}
