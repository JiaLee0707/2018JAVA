//2. ���밪 ���ϱ�
//���ϰ� o, �Ű����� o

import java.util.*;
class method_Test2_3 {
	public int a(int x) {
		if(x<0) {
			return -x;
		}
		else {
			return x;
		}
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method_Test2_3 m3=new method_Test2_3();
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int y=sc.nextInt();
		System.out.println(y+"�� ���밪 : "+m3.a(y));
	}
}