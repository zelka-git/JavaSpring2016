package classwork160510;

public class Animal {
	//class members
	//state состояние
	private String name; //поле, field
	private String kind;
	private boolean isHungry = true;
	//блок инициализации
	{
		System.out.println("Создани очередное животное");
	}
	
	public Animal(boolean h, String n, String k) {
		// TODO Auto-generated constructor stub
		kind = k;
		name = n;
		isHungry = h;
	}
	public Animal(String kind, String name) {
		// TODO Auto-generated constructor stub
//		this.kind = kind;
//		this.name = name;
		this(true, name, kind);
	}
	public Animal() {
		// TODO Auto-generated constructor stub
		this(true, "", "микроб");
//		kind = "микроб";
//		name = "";
//		isHungry = true;
	}
	public Animal(String kind) {
		this.kind = kind;
		name = "";
		isHungry = false;
	}
	// behavior - поведение
	public void feed(String food) {//метод экземпляра instance methos
		if (isHungry) {
			System.out.println(kind + " '" + name + "' ест " + food);			
			isHungry = false;
		}else {
			System.out.println(kind + " '" + name + "' играет с " + food);						
		}
	}
	public void play() {//по статик ==> instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' обиделся и залез в коробку");
		}else {
			System.out.println(kind + " '" + name + "' играет, пока не проголодался");
			isHungry = true;
		}
		
		
	}
}
