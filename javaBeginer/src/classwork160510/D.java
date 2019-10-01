package classwork160510;

public class D {
	public static final int MAX = 20;
	static int cou; //поле класса
	int count = 0; // поле экземпляра
	{
		count++;
		System.out.println("count=" + count);
		cou++;
		System.out.println("cou=" + cou);
	}
}
