//2. ���밪 ���ϱ�
//���ϰ� x, �Ű����� o

import java.util.*;
class method_Test2_1 {
	public void a(int x) {
		if(x<0) {
			System.out.println(x+"�� ���밪 : "+-x);
		}
		else {
			System.out.println(x+"�� ���밪 : "+x);
		}
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int y=sc.nextInt();
		method_Test2_1 m1=new method_Test2_1();
		m1.a(y);
	}
}