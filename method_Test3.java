//3. ������� �������� �Ǵ�
//���ϰ� x, �Ű����� x

import java.util.*;
class method_Test3 {
	Scanner sc=new Scanner(System.in);
	public void a() {
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		if(x>0) {
			System.out.println(x+"�� ���");
		}
		else {
			System.out.println(x+"�� ����");
		}
	}
	
	public static void main(String ar[]) {
		method_Test3 m=new method_Test3();
		m.a();
	}
}