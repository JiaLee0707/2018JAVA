import java.util.*;

class array_Test8 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
    //5��
    //Ű���忡�� 10���� double�� �Է¹޾� ��� ���
    double a[]=new double[10];
    double total=0;
    System.out.print("10���� double�� �Է��Ͻÿ� : ");
    for(int i=0;i<a.length; i++) {
		double b=sc.nextDouble();
		a[i]=b;
		total+=a[i];
    }
    System.out.println("10���� double�� ��� : "+total/a.length);
 }
}
//����
//6,2,3,1,8 �������� ����