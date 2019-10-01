package classwork160510;

public class A {
	
	String state = ""; //1. инициализация полей
	{
		System.out.println(state);
		state = "start";			//2. блок инициализации
		System.out.println(state);
	}
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println(state);
		state = "конструктор";		//3. конструктор
		System.out.println(state);
		
	}
	public A(String x) {
		this();
		state = x;					//4.		
		System.out.println(x);
	}
	public A(int n) {
		System.out.println("n=" + n);	//3'
	}
	public static void main(String[] args) {
		A a =new A(1);
	}
}
