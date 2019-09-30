package classworl160504;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetAndList {
	 public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Moscow");
		list.add("Paris");
		list.add("New-York");
		list.add("Paris");
		list.add("Moscow");
		list.add("Paris");
		list.add("New-York");
		list.add("New-York");
		list.add("Paris");
		list.add("Paris");
		list.add("New-York");
		list.add("Paris");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
//		Set<String> set = new HashSet<>();
		
		set.addAll(list);
		
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		for (String city : list) { //наш вариант addAll
			set.add(city);
		}
		System.out.println(set);
		
		
		
	}
}
