//4. �� �� ������ �ձ���
//���ϰ� o, �Ű����� x

import java.util.*;
class method_Test4_2 {
	public String a() {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("�� �� ������ ���� ���� ���� 2���� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=x+1; i<y; i++) {
			sum+=i;
		}
		return (x+"�� "+y+" �� �� ������ �� : "+sum);
	}

	public static void main(String ar[]) {
		method_Test4_2 m2=new method_Test4_2();
		System.out.println(m2.a());
	}
}