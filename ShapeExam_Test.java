import java.util.*;

abstract class ShapeExam {
	public static final double PI=3.14;
	public abstract double getArea(); //����
	public abstract double getCircum(); //�ѷ�
}
abstract class Area extends ShapeExam { //����
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	public double getArea() {
		double area=r*r*PI;
		return area;
	}
}
class Circum extends Area { //�ѷ�
	public double getCircum() {
		double circum=r*2*PI;
		return circum;
	}
}
public class ShapeExam_Test {
	public static void main(String ar[]) {
		System.out.print("���� �������� �Է��Ͻÿ� : ");
		Circum c=new Circum();
		System.out.println("���� �ѷ� : "+c.getCircum());
		System.out.println("���� ���� : "+c.getArea());
	}
}