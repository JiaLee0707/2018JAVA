//1. ����� ¦������ Ȧ������ �Ǵ�
//���ϰ� o, �Ű����� o

import java.util.*;
class method_Test1_3 {
	public String a(int x) {
		if(x%2==0) {
			return("¦��");
		}
		else {
			return("Ȧ��");
		}
	}
		
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		method_Test1_3 m3=new method_Test1_3();
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int z=sc.nextInt();
		System.out.println(z+"�� "+m3.a(z));
	}
}