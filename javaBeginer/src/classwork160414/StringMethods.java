package classwork160414;

public class StringMethods {
public static void main(String[] args) {
	String s = "Hello, world!";
	
	System.out.println(s.length());
	for (int i = 0; i < s.length(); i++) {
		System.out.println(i + " : " + s.charAt(i));
	}
	
	System.out.println(s.indexOf('w'));
	System.out.println(s.indexOf('o'));
	System.out.println(s.lastIndexOf('o'));
	
	String phrase = "If the thatcher of thatchwood went to thatch it a th";
	
	System.out.println(phrase.indexOf("went"));
	System.out.println(phrase.indexOf("thatch", 35));
	
	System.out.println(s.substring(6));
	System.out.println(s.substring(7, 12));
	
	String w = s.substring(7, 12);
	System.out.println(w);
	
	String str = "jdel";
	
	  if (str.length() <4){
		    System.out.println(str.toUpperCase()); 
		  }else{
		    System.out.println(str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase());
		  }
}
}
