import java.util.*;

class homework23 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//23��
		int s = 0;
		int p = 0;
		System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a<=b) {
			for(int x = a; x<=b; x++) {
				if(((x%3)==0)|((x%5)==0)) {
					s = s+x;
				}
			}
			p = s/(b-a);
		}
		else if (b<=a) {
			for(int x = b; x<=a; x++) {
				if(((x%3)==0)|((x%5)==0)) {
					s = s+x;
				}
			}
			p = s/(a-b);
		}

		System.out.println(a + "��(��)" +b+"���̿��� 3�� ����̰ų� 5�� ����� ������ ����"+s+"�̰� �����"+p+"�Դϴ�.");

  }
}