//4. �� �� ������ �ձ���
//���ϰ� x, �Ű����� o

import java.util.*;
class method_Test4_1 {
	public void a(int z, int q) {
		int sum=0;
		for(int i=z+1; i<q; i++) {
			sum+=i;
		}
		System.out.println(z+"�� "+q+" �� �� ������ �� : "+sum);
	}

	public static void main(String ar[]) {
		method_Test4_1 m1=new method_Test4_1();
		Scanner sc=new Scanner(System.in);
		System.out.print("�� �� ������ ���� ���� ���� 2���� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		m1.a(x, y);
	}
}