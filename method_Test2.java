//2. ���밪 ���ϱ�
//���ϰ� x, �Ű����� x

import java.util.*;
class method_Test2 {
	public void a() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int a=sc.nextInt();
		if(a<0) {
			System.out.println(-a);
		}
		else {
			System.out.println(a);
		}
	}

	public static void main(String ar[]) {
		method_Test2 m=new method_Test2();
		m.a();
	}
}