package classwork160505;

public class Host {
	public static void main(String[] args) {
		Animal kittie = new Animal("Кот", "Барсик");
//		kittie.name = "Барсик";
//		kittie.kind = "Кот";
		kittie.feed("сосиска");
		kittie.feed("сосиска");
		kittie.feed("сосиска");
		kittie.play();
		kittie.play();
	}
}
