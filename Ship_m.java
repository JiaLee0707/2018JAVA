abstract class Ship {
	public abstract int maxspeed(); //최대 속도
	public abstract int passenger(); //탑승 인원
}
abstract class Maxspeed extends Ship {
	public int maxspeed() {
		int max=30;
		return max;
	}
}
class Passenger extends Maxspeed {
	public int passenger() {
		int parson=100;
		return parson;
	}
}
public class Ship_m {
	public static void main(String ar[]) {
		Passenger p=new Passenger();
		System.out.println("최대 속도 : "+p.maxspeed()+"km");
		System.out.println("탑승 인원 : "+p.passenger()+"명");
	}
}