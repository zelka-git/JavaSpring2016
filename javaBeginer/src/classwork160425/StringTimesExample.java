package classwork160425;

public class StringTimesExample {
	public static void main(String[] args) {
		System.out.println(stringTimes(null, 5));
	}
	static public String stringTimes(String str, int n) {
		  String rezult = "";
		  for (int i = 0; i < n; i++) {
			rezult += str;
		}
		  return rezult;
		}
}
