//3. ������� �������� �Ǵ�
//���ϰ� o, �Ű����� x

import java.util.*;
class method_Test3_2 {
	public String a() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		if(x>0) {
			return(x+"�� ���");
		}
		else {
			return(x+"�� ����");
		}
	}

	public static void main(String ar[]) {
		method_Test3_2 m2=new method_Test3_2();
		System.out.println(m2.a());
	}
}