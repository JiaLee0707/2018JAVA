abstract class Ship {
	public abstract int maxspeed(); //�ִ� �ӵ�
	public abstract int passenger(); //ž�� �ο�
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
		System.out.println("�ִ� �ӵ� : "+p.maxspeed()+"km");
		System.out.println("ž�� �ο� : "+p.passenger()+"��");
	}
}