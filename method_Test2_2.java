//2. ���밪 ���ϱ�
//���ϰ� o, �Ű����� x
import java.util.*;
class method_Test2_2 {
	Scanner sc=new Scanner(System.in);
	public String a(){
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		if(x<0) {
			return (x+"�� ���밪 : "+ -x);
		}
		else {
			return (x+"�� ���밪 : "+ x);
		}
	}

	public static void main(String ar[]) {
		method_Test2_2 m2=new method_Test2_2();
		System.out.println(m2.a());
	}
}