/* �޼��� 4���� ������� �����
1. ����� ¦������ Ȧ������ �Ǵ�
2. ���밪 ���ϱ�
3. ������� �������� �Ǵ�
4. �� �� ������ �ձ���*/

import java.util.*;
class method_Test1 {
	Scanner sc=new Scanner(System.in);
	public void a() {
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+"�� ¦��");
		}
		else {
			System.out.println(num+"�� Ȧ��");
		}
	}

	public static void main(String ar[]) {
		method_Test1 m=new method_Test1();
		m.a();
	}
}