//1. ����� ¦������ Ȧ������ �Ǵ�
//���ϰ� x, �Ű����� o

import java.util.*;
class method_Test1_1 {
	public void x(int a) {
		if(a%2==0) {
			System.out.println(a+"�� ¦��");
		}
		else {
			System.out.println(a+"�� Ȧ��");
		}
	}
	
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int y=sc.nextInt();
		method_Test1_1 m1=new method_Test1_1();
		m1.x(y);
	}
}