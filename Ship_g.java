abstract class Ship {
	public abstract int Passengers(); //½Â°´
	public abstract int Luggage(); //Áü
}
abstract class passengers extends Ship {
	public int Passengers() {
		int person=10;
		return person;
	}
}
class luggage extends passengers {
	public int Luggage() {
		int kg=10;
		return kg;
	}
}
public class Ship_g {
	public static void main(String ar[]) {
		luggage l=new luggage();
		System.out.println("ÃÖ´ë ´ä½Â ÀÎ¿ø : "+l.Passengers()+"¸í");
		System.out.println("ÃÖ´ë ÀûÀç·® : "+l.Luggage()+"kg");
	}
}