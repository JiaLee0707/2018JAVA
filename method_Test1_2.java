//1. ����� ¦������ Ȧ������ �Ǵ�
//���ϰ� o, �Ű����� x

import java.util.*;
class method_Test1_2 {
	Scanner sc=new Scanner(System.in);
	public String x() {
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int a=sc.nextInt();
		if(a%2==0) {
			return(a+"�� ¦��");
		}
		else {
			return(a+"�� Ȧ��");
		}
	}

	public static void main(String ar[]) {
		method_Test1_2 m2=new method_Test1_2();
		System.out.println(m2.x());
	}
}