import java.util.*;

abstract class Vehicle {
	Scanner sc=new Scanner(System.in);
	String name;
	int price;

	abstract public String start(int x);
	abstract public int stop(String x);
	abstract public String take();
}
abstract class bus extends Vehicle {
	String name="����";
	
	public String start(int x) { //��߽ð�
		String st="����";
		return st; 
	}
	public int stop(String x) { //������
		int y=5;
		return y;//�����ð�
	}
}
class Str extends bus {
	public String take() {
		String Starting=sc.next();
		return Starting;
	}
}
class traffic {
	public static void main(String ar[]) {
		Str s=new Str();
		s.take();
	}
}