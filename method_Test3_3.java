//3. ������� �������� �Ǵ�
//���ϰ� o, �Ű����� o

import java.util.*;
class method_Test3_3 {
	public String a(int x) {
		if(x>0) {
			return "���";
		}
		else {
			return "����";
		}
	}

	public static void main(String ar[]) {
		method_Test3_3 m3=new method_Test3_3();
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int y=sc.nextInt();
		System.out.println(y+"�� "+m3.a(y));
	}
}