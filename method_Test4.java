//4. �� �� ������ �ձ���
//���ϰ� x, �Ű����� x

import java.util.*;
class method_Test4 {
	public void a() {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("�� �� ������ ���� ���� ���� 2���� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=x+1; i<y; i++) {
			sum+=i;
		}
		System.out.println(x+"�� "+y+" �� �� ������ �� : "+sum);
	}

	public static void main(String ar[]) {
		method_Test4 m=new method_Test4();
		m.a();
	}
}