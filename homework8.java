import java.util.*;

class homework8 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//8��
		int p = 0;
		int t = 0;
		int a = 0;
		while (a<1)
		{
			System.out.println("100������ ������ �Է��Ͻÿ� : ");
			int n = sc.nextInt ();
		
			if(n<=100) {
				for (int i = 0; i<n; i++) {
					System.out.println("����� ���ϱ� ���� ������ �Է��Ͻʽÿ�.");
					int x = sc.nextInt ();
					t = t+x;
					}
				p = t/n;
				System.out.println("n���� ������ ����� "+p+"�Դϴ�.");
				return;
			}
		}
  }
}