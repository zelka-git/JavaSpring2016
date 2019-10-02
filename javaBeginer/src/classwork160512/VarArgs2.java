package classwork160512;

import java.util.Arrays;
import java.util.List;

public class VarArgs2 {
	public static void main(String[] args) {
		List<String> list3 = Arrays.asList("one", "two", "three");
		List<String> list1 = Arrays.asList("one");
		List<String> list0 = Arrays.asList();
	}
	void m1(int... nums) {}
	void m2(int start, int... nums) {}
//	void m2(int... start, int... nums) {}	//WRONG!
//	void m2(int... start, int nums) {}  //WRONG!

}
