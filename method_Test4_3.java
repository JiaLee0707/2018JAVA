//4. �� �� ������ �ձ���
//���ϰ� o, �Ű����� o

import java.util.*;
class method_Test4_3 {
	public String a(int z, int q) {
		int sum=0;
		for(int i=z+1; i<q; i++) {
			sum+=i;
		}
		return(z+"�� "+q+" �� �� ������ �� : "+sum);
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method_Test4_3 m3=new method_Test4_3();
		System.out.print("�� �� ������ ���� ���� ���� 2���� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(m3.a(x, y));
	}
}