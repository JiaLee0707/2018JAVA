import java.util.*;

class homework7 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	//7��
	for (int a=0; 1>a; ) {
		System.out.print("������ �����Ͻðڽ��ϱ�? ");
		int c = sc.nextInt ();
		if (c==1) {
			a=1;
		}
		else if (c==0) {
			continue;
		}
		else {
			System.out.println("0(����) �Ǵ� 1(���)�� �Է��Ͻʽÿ�.");
		}
	}
  }
} 