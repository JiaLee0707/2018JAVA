import java.util.*;

class vacation_homework2 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		//ȭ���� ������ ��ȯ�ϴ� �ڵ�
		System.out.print("ȭ���µ��� �Է��Ͻÿ� : ");
		float h=sc.nextFloat();
		double s=(h-32)/1.8;
		System.out.println(h+"(ȭ��)="+s+"(����)");
	}
}