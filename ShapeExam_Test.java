import java.util.*;

abstract class ShapeExam {
	public static final double PI=3.14;
	public abstract double getArea(); //면적
	public abstract double getCircum(); //둘레
}
abstract class Area extends ShapeExam { //면적
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	public double getArea() {
		double area=r*r*PI;
		return area;
	}
}
class Circum extends Area { //둘레
	public double getCircum() {
		double circum=r*2*PI;
		return circum;
	}
}
public class ShapeExam_Test {
	public static void main(String ar[]) {
		System.out.print("원의 반지름을 입력하시오 : ");
		Circum c=new Circum();
		System.out.println("원의 둘레 : "+c.getCircum());
		System.out.println("원의 면적 : "+c.getArea());
	}
}