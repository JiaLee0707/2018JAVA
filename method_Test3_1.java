//3. ������� �������� �Ǵ�
//���ϰ� x, �Ű����� o

import java.util.*;
class method_Test3_1 {
	public void a(int x) {
		if(x>0) {
			System.out.println(x+"�� ���");
		}
		else {
			System.out.println(x+"�� ����");
		}
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method_Test3_1 m1=new method_Test3_1();
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int y=sc.nextInt();
		m1.a(y);
	}
}