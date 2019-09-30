package classworl160504;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
